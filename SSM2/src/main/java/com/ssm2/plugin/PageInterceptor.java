package com.ssm2.plugin;

import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;


@Intercepts(@Signature(
        type = Executor.class,
        method = "query",
        args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}
))
public class PageInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object[] args=invocation.getArgs();
        MappedStatement ms= (MappedStatement) args[0];
        Object parameterObject= args[1];
        RowBounds rowBounds= (RowBounds) args[2];
        //如果需要分页
        if(rowBounds!=RowBounds.DEFAULT){
            Executor executor= (Executor) invocation.getTarget();
            BoundSql boundSql = ms.getBoundSql(parameterObject);
            Field additionalParametersField = BoundSql.class.getDeclaredField("additionalParameters");
            additionalParametersField.setAccessible(true);
            Map<String,Object> additionalParameters = (Map<String,Object>) additionalParametersField.get(boundSql);

            if(rowBounds instanceof PageRowBounds){
//                new MappedStatement(ms,Long.class);
            }

            CacheKey pageKey = executor.createCacheKey(ms, parameterObject, rowBounds, boundSql);
            pageKey.update("RowBounds");
            String pageSql=boundSql.getSql()+"limit"+rowBounds.getOffset()+","+rowBounds.getLimit();
            BoundSql pageBoundSql = new BoundSql(ms.getConfiguration(), pageSql, boundSql.getParameterMappings(), parameterObject);
            Set<String> keySet = additionalParameters.keySet();
            for(String key:keySet){
                pageBoundSql.setAdditionalParameter(key,additionalParameters.get(key));
            }

            executor.query(ms,parameterObject,RowBounds.DEFAULT, (ResultHandler) args[3],pageKey,pageBoundSql);
        }

        return invocation.proceed();
    }
}

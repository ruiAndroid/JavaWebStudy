package com.ssm2.converter;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@MappedJdbcTypes(JdbcType.VARCHAR)  //指定要处理的jdbc数据类型
@MappedTypes(List.class)    //指定要处理的Java类型
public class List2VarcharHandler implements TypeHandler<List<String>> {

    //设置数据
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, List<String> strings, JdbcType jdbcType) throws SQLException {
        StringBuffer sb =new StringBuffer();
        for(String s:strings){
            sb.append(s).append(",");
        }

        preparedStatement.setString(i,sb.toString());

    }

    //查询数据时处理
    @Override
    public List<String> getResult(ResultSet resultSet, String s) throws SQLException {
        String favs=resultSet.getString(s);
        if(favs!=null){
            return Arrays.asList(favs.split(","));
        }
        return null;
    }

    @Override
    public List<String> getResult(ResultSet resultSet, int i) throws SQLException {
        String favs=resultSet.getString(i);
        if(favs!=null){
            return Arrays.asList(favs.split(","));
        }
        return null;
    }

    @Override
    public List<String> getResult(CallableStatement callableStatement, int i) throws SQLException {
        String favs=callableStatement.getString(i);
        if(favs!=null){
            return Arrays.asList(favs.split(","));
        }
        return null;
    }
}

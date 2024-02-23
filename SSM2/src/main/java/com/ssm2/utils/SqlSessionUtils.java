package com.ssm2.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class SqlSessionUtils {
    public static SqlSessionFactory SQLSESSIONFACTORY=null;

    public static SqlSessionFactory getInstance(){
        if(SQLSESSIONFACTORY==null){
            try {
                SQLSESSIONFACTORY= new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return SQLSESSIONFACTORY;
    }


}

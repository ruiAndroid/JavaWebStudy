package com.ssm2;

import com.ssm2.bean.User;
import com.ssm2.mapper.UserMapper;
import com.ssm2.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        SqlSessionFactory factory = SqlSessionUtils.getInstance();

        SqlSession sqlSession = factory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateUserNameById("张四",1);

        sqlSession.commit();

        sqlSession.close();


    }
}

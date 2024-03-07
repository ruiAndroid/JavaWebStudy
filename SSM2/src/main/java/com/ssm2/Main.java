package com.ssm2;

import com.ssm2.bean.Author;
import com.ssm2.bean.Book;
import com.ssm2.bean.User;
import com.ssm2.mapper.BookMapper;
import com.ssm2.mapper.UserMapper;
import com.ssm2.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        SqlSessionFactory factory = SqlSessionUtils.getInstance();

        SqlSession sqlSession = factory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);



//        Book book=bookMapper.getBookById2(2);
//        System.out.print(book.toString());
//        int age=book.getAuthor().getAuthorAge();
//        System.out.print(age);

        List<User> users=userMapper.getAllUserWithRole();
        System.out.print(users.toString());
        sqlSession.commit();

        sqlSession.close();


    }
}

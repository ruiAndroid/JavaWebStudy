package com.model;

import aop.MyCalculator;
import aop.MyCalculatorImpl;
import aop.MyCalculatorProxy;
import com.javaconfig.JavaConfig;
import condition.ShowCmd;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.services.UserService;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
/*        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OkHttpClient okHttpClient = context.getBean("okHttpClient", OkHttpClient.class);
        Request request = new Request.Builder()
                .url("www.baidu.com")
                .build();
        Response response = okHttpClient.newCall(request).execute();

        System.out.print(response.body().string());*/

     /*   AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfig.class);
        UserService userService=ctx.getBean(UserService.class);
        List<String> users = userService.getUsers();
        System.out.println(users);*/

/*        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfig.class);
        ShowCmd showCmd= (ShowCmd) ctx.getBean("showCmd");
        System.out.println(showCmd.showCmd());*/

        //动态切换环境
/*        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("dev");
        ctx.register(JavaConfig.class);
        ctx.refresh();
        DataSource ds = (DataSource) ctx.getBean("ds");
        System.out.println(ds);*/

        //动态代理
/*        MyCalculatorImpl myCalculator=new MyCalculatorImpl();
        MyCalculator myCalculator1 = (MyCalculator) MyCalculatorProxy.getInstance(myCalculator);

        myCalculator1.add(1,2);*/

        //aop
/*        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfig.class);
        MyCalculator myCalculator = ctx.getBean(MyCalculator.class);
        myCalculator.add(1,2);
        myCalculator.min(1,2);*/

        //JDBC template





    }

}

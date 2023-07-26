package com.javaconfig;

import com.model.DataSource;
import condition.*;
import org.springframework.context.annotation.*;

/**
 * 表示这是一个Java配置类，类似于applicationContext.xml
 *
 */
@Configuration
@ComponentScan(basePackages = "aop")
@EnableAspectJAutoProxy //开启自动代理
public class JavaConfig {

    @Bean("showCmd")
    @Conditional(WinCondition.class)
    ShowCmd winCmd(){
        return new WinShowCmd();
    }

    @Bean("showCmd")
    @Conditional(OsCondition.class)
    ShowCmd osCmd(){
        return new OsShowCmd();
    }



    @Bean("ds")
    @Profile("dev")
    @Scope("prototype")
    DataSource devDs(){
        DataSource dataSource=new DataSource();
        dataSource.setUrl("jdbc:mysql://rui");
        dataSource.setUsername("rui");
        dataSource.setPassword("rui123");
        return dataSource;
    }
    @Bean("ds")
    @Profile("prod")
    @Scope("singleton")
    DataSource prodDs(){
        DataSource dataSource=new DataSource();
        dataSource.setUrl("jdbc:mysql://192.168.1.1:8080/rui");
        dataSource.setUsername("rui");
        dataSource.setPassword("rui123");
        return dataSource;
    }

}

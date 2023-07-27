package jdbcTemplate;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * jdbc 配置类
 */
@Configuration
@ComponentScan
public class JdbcConfig {

    @Bean
    DataSource dataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("jianrui123");
        dataSource.setUrl("jdbc:mysql:///test");
        return dataSource;
    }




    @Bean
    JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }


}

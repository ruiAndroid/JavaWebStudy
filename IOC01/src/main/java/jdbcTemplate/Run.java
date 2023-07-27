package jdbcTemplate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Run {



    public static void main(String[] args) throws IOException {

        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(JdbcConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        userService.insertUser();
//        JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);
//
//
//        List<User> users = jdbcTemplate.query("SELECT * FROM USER", new BeanPropertyRowMapper<>(User.class));
//        System.out.print("users:"+users);


    }
}

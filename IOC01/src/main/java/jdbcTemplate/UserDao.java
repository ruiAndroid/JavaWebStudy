package jdbcTemplate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 新增一个user
     */
    public void addUser(String userName,String gender){
        jdbcTemplate.update("INSERT INTO USER(userName,gender) VALUES (?,?);",userName,gender);
    }






}

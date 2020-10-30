package cn.asu;

import cn.asu.entity.User;
import cn.asu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot04JdbcApplicationTests {

    @Autowired
    private UserService userService;

    /**
     * 根据id查询单个用户
     */
    @Test
    public void selectById() {
        User user = userService.selectById(1);
        System.out.println(user.getName());
    }

    /**
     * 查询所以用户
     */
    @Test
    public void selectAllUser() {
        List<User> userList = userService.selectAllUser();
        for (User user : userList) {
            System.out.println(user.getName() + "\t");
        }
    }

    /**
     * 增加用户
     */
    @Test
    public void addUser() {
        User user = new User();
        user.setName("小王");
        user.setAge(20);
        user.setSex("男");
        userService.addUser(user);
    }

    /**
     * 删除用户
     */
    @Test
    public void deleteUser() {
        userService.deleteUser(10);
    }

    /**
     * 修改用户
     */
    @Test
    public void updateUser() {
        User user = new User();
        user.setName("小美");
        user.setSex("女");
        user.setAge(18);
        user.setId(11);
        userService.updateUser(user);
    }

}

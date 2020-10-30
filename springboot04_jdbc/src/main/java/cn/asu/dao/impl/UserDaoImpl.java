package cn.asu.dao.impl;

import cn.asu.dao.UserDao;
import cn.asu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Celery
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User selectById(Integer id) {
        String sql = "select * from m_user where id=?";
        Object[] objs = {id};
        User user = jdbcTemplate.queryForObject(sql, objs, new BeanPropertyRowMapper<>(User.class));
        return user;
    }

    @Override
    public List<User> selectAllUser() {
        String sql = "select * from m_user";
        Object[] objs = {};
        List<User> userList = jdbcTemplate.query(sql, objs, new BeanPropertyRowMapper<>(User.class));
        return userList;
    }

    @Override
    public int addUser(User user) throws Exception {
        String sql = "insert into m_user(name,sex,age) values(?,?,?)";
        Object[] objs = {user.getName(), user.getSex(), user.getAge()};
        return jdbcTemplate.update(sql, objs);
    }

    @Override
    public int deleteUser(Integer id) throws Exception {
        String sql = "delete from m_user where id=?";
        Object[] objs = {id};
        return jdbcTemplate.update(sql, objs);
    }

    @Override
    public int updateUser(User user) throws Exception {
        String sql = "update m_user set name=?,sex=?,age=? where id=?";
        Object[] objs = {user.getName(), user.getSex(), user.getAge(), user.getId()};
        return jdbcTemplate.update(sql, objs);
    }

}

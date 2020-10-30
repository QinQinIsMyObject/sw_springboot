package cn.asu.service.impl;

import cn.asu.dao.UserDao;
import cn.asu.entity.User;
import cn.asu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Celery
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User selectById(Integer id) {
        try {
            User user = userDao.selectById(id);
            if (user != null) {
                return user;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> selectAllUser() {
        try {
            List<User> userList = userDao.selectAllUser();
            if (userList != null) {
                return userList;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int addUser(User user) {
        try {
            return userDao.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteUser(Integer id) {
        try {
            return userDao.deleteUser(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateUser(User user) {
        try {
            return userDao.updateUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

}

package cn.asu.service;

import cn.asu.entity.User;

import java.util.List;

/**
 * @author Celery
 */
public interface UserService {

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    User selectById(Integer id);

    /**
     * 查询所有
     *
     * @return
     */
    List<User> selectAllUser();

    /**
     * 增加用户
     *
     * @param user
     * @return
     * @throws Exception
     */
    int addUser(User user);

    /**
     * 根据id删除用户
     *
     * @param id
     * @return
     * @throws Exception
     */
    int deleteUser(Integer id);

    /**
     * 更新用户
     *
     * @param user
     * @return
     * @throws Exception
     */
    int updateUser(User user);

}

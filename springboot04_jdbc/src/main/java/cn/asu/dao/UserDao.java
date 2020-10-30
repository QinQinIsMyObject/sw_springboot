package cn.asu.dao;

import cn.asu.entity.User;

import java.util.List;

/**
 * @author Celery
 */
public interface UserDao {
    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    User selectById(Integer id) throws Exception;

    /**
     * 查询所有
     *
     * @return
     */
    List<User> selectAllUser() throws Exception;

    /**
     * 增加用户
     *
     * @param user
     * @return
     * @throws Exception
     */
    int addUser(User user) throws Exception;

    /**
     * 根据id删除用户
     *
     * @param id
     * @return
     * @throws Exception
     */
    int deleteUser(Integer id) throws Exception;

    /**
     * 更新用户
     *
     * @param user
     * @return
     * @throws Exception
     */
    int updateUser(User user) throws Exception;

}

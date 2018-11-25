package com.mmall.dao;

import com.mmall.pojo.User;
import com.mmall.pojo.UserExample;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_user
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_user
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_user
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_user
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_user
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_user
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_user
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    int updateByPrimaryKey(User record);

    int checkUsername(String username);

    User selectLogin(@Param("username") String username, @Param("password") String password);
}
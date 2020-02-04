package com.jxust.community.dao;

import com.jxust.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author sxtstart
 * @create 2020-01-09 15:37
 */
@Mapper
public interface UserMapper {

    User selectById(Integer id);

    User selectByName(String username);

    User selectByEmail(String email);

    Integer insertUser(User user);

    Integer updateStatus(@Param("id") Integer id, @Param("status") Integer status);

    Integer updateHeader(@Param("id")Integer id, @Param("headerUrl") String headerUrl);

    Integer updatePassword(@Param("id")Integer id, @Param("password") String password);

}

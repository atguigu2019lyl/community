package com.jxust.community.dao;

import com.jxust.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author sxtstart
 * @create 2020-01-10 13:48
 */
@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(@Param("userId") Integer userId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    // @Param注解用于给参数取别名
    // 如果只有一个参数，并且在<if>里面使用，则必须加别名
    Integer selectDiscussPostRows(@Param("userId") Integer userId);
}

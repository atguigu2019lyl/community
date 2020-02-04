package com.jxust.community;

import com.jxust.community.dao.DiscussPostMapper;
import com.jxust.community.dao.UserMapper;
import com.jxust.community.entity.DiscussPost;
import com.jxust.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Date;
import java.util.List;

/**
 * @author sxtstart
 * @create 2020-01-09 16:12
 */
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectUser() {
        User user = userMapper.selectById(101);
        System.out.println(user);

        user = userMapper.selectByName("liubei");
        System.out.println(user);

        user = userMapper.selectByEmail("nowcoder101@sina.com");
        System.out.println(user);
    }

    @Test
    public void testInsertUser() {
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123");
        user.setSalt("a10f");
        user.setEmail("123.com");
        user.setHeaderUrl("http://www.newcoder.com/101.png");
        user.setCreateTime(new Date());
        Integer rows = userMapper.insertUser(user);
        System.out.println(user.getId());
    }

    @Test
    public void testUpdateUser() {
        Integer rows = userMapper.updateStatus(150, 1);
        System.out.println(rows);
        rows = userMapper.updateHeader(150, "http://www.newcoder.com/103.png");
        System.out.println(rows);
        rows = userMapper.updatePassword(150, "111");
        System.out.println(rows);

    }

    @Test
    public void testSelectDiscuss() {
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(149, 0, 10);
        for (DiscussPost post: list ) {
            System.out.println(post);
        }

        Integer rows = discussPostMapper.selectDiscussPostRows(149);
        System.out.println(rows);
    }
}

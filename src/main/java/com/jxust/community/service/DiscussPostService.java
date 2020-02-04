package com.jxust.community.service;

import com.jxust.community.dao.DiscussPostMapper;
import com.jxust.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sxtstart
 * @create 2020-01-10 14:40
 */
@Service
public class DiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> findDiscussPost(Integer userId, Integer offset, Integer limit) {
        return discussPostMapper.selectDiscussPosts(userId, offset, limit);
    }

    public Integer findDiscussPostRows(Integer userId) {
        return discussPostMapper.selectDiscussPostRows(userId);
    }
}

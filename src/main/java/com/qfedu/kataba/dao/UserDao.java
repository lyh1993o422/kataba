package com.qfedu.kataba.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qfedu.kataba.entity.User;
import org.springframework.stereotype.Repository;

/**
 * 基于Mybatis-plus 实现持久层
 */
@Repository
public interface UserDao extends BaseMapper<User> {
}

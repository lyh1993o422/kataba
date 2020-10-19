package com.qfedu.kataba.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qfedu.kataba.dao.UserDao;
import com.qfedu.kataba.entity.User;
import com.qfedu.kataba.service.intf.UserService;
import com.qfedu.kataba.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: kataba
 *
 * @author: 她似月儿不可及
 * time: 2020/10/19 19:43
 * description:
 */

@Service
public class UserServiceImpl implements UserService {

   @Autowired
    private UserDao userDao;

    @Override
    public R<List<User>> all() {

        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.orderByDesc("id");
        return R.ok(userDao.selectList(qw));
    }
}

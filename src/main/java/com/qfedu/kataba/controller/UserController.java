package com.qfedu.kataba.controller;

import com.qfedu.kataba.service.intf.UserService;
import com.qfedu.kataba.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: kataba
 *
 * @author: 她似月儿不可及
 * time: 2020/10/19 17:58
 * description:
 */

@RestController
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("all.do")
    public R all(){
        return service.all();
    }

}

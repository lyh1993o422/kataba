package com.qfedu.kataba.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * projectName: kataba
 *
 * @author: 她似月儿不可及
 * time: 2020/10/19 19:02
 * description:
 */

@Data
@TableName("t_user")
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String phone;
    private String nickname;
    private String password;
    private int flag;//标记位 1有效  2无效
}

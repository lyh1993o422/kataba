package com.qfedu.kataba.dto;

import lombok.Data;

/**
 * projectName: kataba
 *
 * @author: 她似月儿不可及
 * time: 2020/10/19 19:40
 * description:
 */

@Data
public class UserDto {

    private String phone;
    private String nname;//昵称
    private String pwd;//密码
}

package com.qfedu.kataba.service.intf;

import com.qfedu.kataba.entity.User;
import com.qfedu.kataba.vo.R;

import java.util.List;

public interface UserService {
    R<List<User>> all();
}

package com.asiainfo.hufei.service.impl;


import com.asiainfo.hufei.api.IUserService;
import com.asiainfo.hufei.dao.mapper.UserMapper;
import com.asiainfo.hufei.model.User;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

/**
 * @author hufei
 * @date 2019/3/4
 */
@Service
public class UserSevicesImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User selectByPrimaryKey(Integer id) {
//        return User.builder().name("hufei").id(1).age(18).build();
        Optional<User> user = userMapper.selectByPrimaryKey(id);
        user.orElseThrow(IllegalArgumentException::new);
        return user.get();
    }

    @Override
    public List<User> getAllUser() {
//        return null;
        return userMapper.getAllUser();
    }
}

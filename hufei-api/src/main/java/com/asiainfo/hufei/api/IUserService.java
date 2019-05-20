package com.asiainfo.hufei.api;


import com.asiainfo.hufei.model.User;

import java.util.List;

/**
 * @author hufei
 * @date 2019/3/4
 */
public interface IUserService {
    User selectByPrimaryKey(Integer id);

    List<User> getAllUser();
}

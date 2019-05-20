package com.asiainfo.hufei.web.controller;


import com.asiainfo.hufei.api.IUserService;
import com.asiainfo.hufei.model.User;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hufei
 * @date 2019/3/4
 */
@RequestMapping(path = "/user")
@RestController
public class UserController {

    /** logger */
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Reference(url = "dubbo://localhost:12345")
    private IUserService userSerice;

   @GetMapping(value = "/getUser/{id}")
   public User getUser(@PathVariable("id") Integer id) {
       User user = User.builder().id(id).age(10).name("Unknown").build();
//       Preconditions.checkNotNull(hufei.getName(), "name may not be null");
       User hufei;
       try {
           hufei = userSerice.selectByPrimaryKey(id);
       } catch (Exception e) {
           LOGGER.error("shibai", e);
           hufei = user;
       }
       LOGGER.info("name:{},user:{}", "hf", hufei);
       return hufei;
    }

    @GetMapping(value = "/getUserCommand/{id}")
    public User getUserCommand(@PathVariable("id") Integer id) {
//        UserCommand userCommand = new UserCommand(id, userSerice);
//        User user = userCommand.execute();
//        LOGGER.info(user.toString());
//        return user;
        return null;
    }

    @GetMapping(value = "getAllUser")
    public List<User> getAllUser() {
        return userSerice.getAllUser();
    }
}

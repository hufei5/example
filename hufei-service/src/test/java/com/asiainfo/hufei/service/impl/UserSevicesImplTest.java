package com.asiainfo.hufei.service.impl;

import com.asiainfo.hufei.api.IUserService;
import com.asiainfo.hufei.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserSevicesImplTest {
    /** logger */
    private static final Logger LOGGER = LoggerFactory.getLogger(UserSevicesImplTest.class);

    @Autowired
    private IUserService userService;

    @Test
    public void selectByPrimaryKey() {
        User user = userService.selectByPrimaryKey(1);
        LOGGER.info(user.toString());
    }


}
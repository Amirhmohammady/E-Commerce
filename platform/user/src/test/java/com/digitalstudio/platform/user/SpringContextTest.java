package com.digitalstudio.platform.user;

import com.digitalstudio.platform.user.service.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class SpringContextTest {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    UserServiceImpl userService;

    @Test
    void shouldLoadApplicationContext(){
        Assertions.assertNotNull(applicationContext);
    }

    @Test
    void shouldInjectUserService(){
        Assertions.assertNotNull(userService);
    }

}

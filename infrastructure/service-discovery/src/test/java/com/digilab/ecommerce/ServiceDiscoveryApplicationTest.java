package com.digilab.ecommerce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

/**
 * Created by Amir on 4/2/2022.
 */
@SpringBootTest
//@RunWith(SpringRunner.class)//4
//@ExtendWith(SpringExtension.class)//5
//@ExtendWith(AmirExtention.class)
class ServiceDiscoveryApplicationTest {
    @Autowired
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {

    }

    @Test
    void loadContext() {
        Assertions.assertNotNull(applicationContext);
        Arrays.asList(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
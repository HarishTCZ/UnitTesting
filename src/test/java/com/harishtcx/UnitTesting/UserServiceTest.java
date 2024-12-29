package com.harishtcx.UnitTesting;

import com.harishtcx.UnitTesting.Service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    UserService userService;
    @Test
    void myFirstTest(){
        System.out.println("My first test");
        userService.getAll();
    }
}

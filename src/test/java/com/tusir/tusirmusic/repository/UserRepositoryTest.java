package com.tusir.tusirmusic.repository;

import com.tusir.tusirmusic.entity.User;
import com.tusir.tusirmusic.enums.Gender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tusir
 * @version 1.0.0
 */
@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository repository;

    @Test
    void findByUsername() {
        User user = new User();
        user.setUsername("Tusir");
        user.setNickname("程序员Tusir");
        user.setEnabled(true);
        user.setLocked(false);
        user.setPassword("631156");
        user.setGender(Gender.MALE);
        user.setLastLoginIp("127.0.0.1");
        user.setLastLoginTime(new Date());

        User saveUser = repository.save(user);
        User findUser = repository.getByUsername("Tusir");
        System.out.println(findUser.toString());
    }
}
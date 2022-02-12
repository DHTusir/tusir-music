package com.tusir.tusirmusic.repository;

import com.tusir.tusirmusic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Tusir
 * @version 1.0.0
 */
public interface UserRepository extends JpaRepository<User, String> {

    //根据名称查询
    User getByUsername(String username);
}

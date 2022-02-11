package com.tusir.tusirmusic.service;

import com.tusir.tusirmusic.dto.UserDto;
import com.tusir.tusirmusic.mapper.UserMapper;
import com.tusir.tusirmusic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Tusir
 * @version 1.0.0
 */
@Service
public class UserServiceImpl implements UserService{

    UserRepository userRepository;

    UserMapper userMapper;

    @Override
    public List<UserDto> list() {
        return userRepository.findAll()
                .stream().map(userMapper::toDto).collect(Collectors.toList());
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}

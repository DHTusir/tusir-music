package com.tusir.tusirmusic.service;

import com.tusir.tusirmusic.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Tusir
 * @version 1.0.0
 */
public interface UserService {
    List<UserDto> list();
}

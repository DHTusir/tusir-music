package com.tusir.tusirmusic.mapper;

import com.tusir.tusirmusic.dto.UserDto;
import com.tusir.tusirmusic.entity.User;
import com.tusir.tusirmusic.vo.UserVo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author Tusir
 * @version 1.0.0
 */
@Mapper(componentModel = "spring")
@Component
public interface UserMapper {
    UserDto toDto(User user);

    UserVo toVo(UserDto userDto);
}

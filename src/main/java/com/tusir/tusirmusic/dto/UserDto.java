package com.tusir.tusirmusic.dto;

import com.tusir.tusirmusic.vo.RoleVo;
import lombok.Data;

import java.util.List;

/**
 * @author Tusir
 * @version 1.0.0
 */
@Data
public class UserDto {
    private String id;
    private String username;
    private String nickname;
    private List<RoleVo> roles;
}

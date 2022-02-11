package com.tusir.tusirmusic.vo;

import lombok.Data;

import java.util.List;

/**
 * @author Tusir
 * @version 1.0.0
 */
@Data
public class UserVo {

    private String id;
    private String username;
    private String nickname;
    private List<RoleVo> roles;
}

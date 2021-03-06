CREATE TABLE user
    (
        id VARCHAR (32) NOT NULL
            PRIMARY KEY COMMENT '用户id',
        username VARCHAR (64) NOT NULL COMMENT '用户名',
        nickname VARCHAR (64) NOT NULL COMMENT '用户昵称',
        password VARCHAR (64) NOT NULL COMMENT '加密后的密码',
        gender VARCHAR (64) NOT NULL COMMENT '性别',
        locked int (1) DEFAULT 0 NOT NULL COMMENT '是否锁定，1-是，0-否',
        enabled int (1) DEFAULT 1 NOT NULL COMMENT '是否可用，1-是，0-否',
        last_login_ip VARCHAR(64) NULL COMMENT '最后登录ip',
        last_login_time timestamp NULL COMMENT '最后登录时间',
        created_time timestamp NOT NULL COMMENT '创建时间',
        update_time timestamp NOT NULL COMMENT '更新时间',
        CONSTRAINT uk_user_username
            UNIQUE (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT '用户表';
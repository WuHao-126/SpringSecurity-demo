package com.security.domain.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_user")
public class User {
    private Integer id;
    private String name;
    private String username;
    private String password;
    private String remark;
}

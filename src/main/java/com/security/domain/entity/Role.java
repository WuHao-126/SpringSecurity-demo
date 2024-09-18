package com.security.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_role")
public class Role {
    private Integer id;
    private String name;
    private String remark;
}

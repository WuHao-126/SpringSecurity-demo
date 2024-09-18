package com.security.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_permission")
public class Permission {
    private int id;
    private String name;
    private String url;
    private String parentId;
    private String type;
    private String permit;
    private String remark;
}

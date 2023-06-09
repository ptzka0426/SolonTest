package com.example.demo.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@TableName("user")
public class UserModel {
    @TableId("id")
    Integer id;

    String username;

    String password;
    //    @TableLogic
    String createTime;

    String updateTime;
}
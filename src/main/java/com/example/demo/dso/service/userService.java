package com.example.demo.dso.service;

import com.example.demo.dso.mapper.UserMapper;
import com.example.demo.model.UserModel;
import org.apache.ibatis.solon.annotation.Db;
import org.noear.solon.annotation.ProxyComponent;

@ProxyComponent
public class userService {
    @Db
    UserMapper sqlMapper1;

    public UserModel getApp(int app_id) throws Exception {
        return sqlMapper1.selectById(app_id);
    }
}

package com.example.demo.dso;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
public class MybatisSqlSessionFactoryBuilderImpl extends MybatisSqlSessionFactoryBuilder {
    @Override
    public SqlSessionFactory build(Configuration configuration) {
        System.out.println(".进来了.");
        return super.build(configuration);
    }
}

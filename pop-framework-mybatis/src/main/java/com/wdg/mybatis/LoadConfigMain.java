package com.wdg.mybatis;

import com.sun.tools.javac.util.Assert;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description: ´´½¨SqlSessionFactory
 * @author: WuDG/1490727316@qq.com
 * @date: 2020/12/30 16:19
 */
public class LoadConfigMain {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        Assert.checkNonNull(sqlSessionFactory);
    }
}

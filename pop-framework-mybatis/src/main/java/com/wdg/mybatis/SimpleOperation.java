package com.wdg.mybatis;

import com.sun.tools.javac.util.Assert;
import com.wdg.mybatis.mapper.BlogMapper;
import com.wdg.mybatis.pojo.Blog;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description: 简单通过mybatis操作mysql数据
 * @author: WuDG/1490727316@qq.com
 * @date: 2020/12/30 16:19
 */
public class SimpleOperation {

    private static final Logger logger = Logger.getLogger(SimpleOperation.class);

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        Assert.checkNonNull(sqlSessionFactory);

        try(SqlSession session = sqlSessionFactory.openSession()) {
//            Blog blog = session.selectOne("com.wdg.mybatis.mapper.BlogMapper.select", 1);
            BlogMapper mapper = session.getMapper(BlogMapper.class);
            Blog blog = mapper.select(1);
            Blog query = mapper.query(1);
            logger.info(blog);
            logger.info(query);
        }
    }
}

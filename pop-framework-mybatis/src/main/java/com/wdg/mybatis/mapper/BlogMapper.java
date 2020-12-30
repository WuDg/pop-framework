package com.wdg.mybatis.mapper;

import com.wdg.mybatis.pojo.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @description: mybatis mapper
 * @author: WuDG/1490727316@qq.com
 * @date: 2020/12/28 10:49
 */
@Mapper
public interface BlogMapper {
    Blog select(Integer id);

    @Select("SELECT * FROM tb_blog WHERE id = #{id}")
    Blog query(Integer id);

    int update(Blog blog);
}

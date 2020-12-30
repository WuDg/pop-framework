package com.wdg.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: Blog µÃÂ¿‡
 * @author: WuDG/1490727316@qq.com
 * @date: 2020/12/28 10:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    private Integer id;
    private String name;
    private String author;
    private Integer value;
}

package com.wdg.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: WuDG/1490727316@qq.com
 * @date: 2020/12/31 12:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBean {
    private String name;
    private Integer age;
}

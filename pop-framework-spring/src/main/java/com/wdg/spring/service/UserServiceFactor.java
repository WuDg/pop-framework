package com.wdg.spring.service;

import com.wdg.spring.bean.UserBean;
import lombok.Data;

/**
 * @description: 用户service
 * @author: WuDG/1490727316@qq.com
 * @date: 2020/12/31 12:09
 */
@Data
public class UserServiceFactor {
    private static UserBean userBean = new UserBean("静态工厂方法注入",22);
    private static UserBean userBean1 = new UserBean("实例方法注入",22);

    /**
     * 静态工厂方法注入
     * @return
     */
    public static UserBean userBean(){
        return userBean;
    }

    /**
     * 实例方法注入
     * @return
     */
    public UserBean userBean1(){
        return userBean1;
    }
}

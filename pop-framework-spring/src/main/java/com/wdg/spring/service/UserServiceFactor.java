package com.wdg.spring.service;

import com.wdg.spring.bean.UserBean;
import lombok.Data;

/**
 * @description: �û�service
 * @author: WuDG/1490727316@qq.com
 * @date: 2020/12/31 12:09
 */
@Data
public class UserServiceFactor {
    private static UserBean userBean = new UserBean("��̬��������ע��",22);
    private static UserBean userBean1 = new UserBean("ʵ������ע��",22);

    /**
     * ��̬��������ע��
     * @return
     */
    public static UserBean userBean(){
        return userBean;
    }

    /**
     * ʵ������ע��
     * @return
     */
    public UserBean userBean1(){
        return userBean1;
    }
}

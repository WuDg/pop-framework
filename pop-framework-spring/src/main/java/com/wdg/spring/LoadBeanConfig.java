package com.wdg.spring;

import com.google.gson.Gson;
import com.wdg.spring.bean.UserBean;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: ∂¡»°spring≈‰÷√¿‡
 * @author: WuDG/1490727316@qq.com
 * @date: 2020/12/31 11:19
 */
public class LoadBeanConfig {
    private static final Gson GSON = new Gson();
    private static final Logger logger = Logger.getLogger(LoadBeanConfig.class);
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserBean bean = context.getBean(UserBean.class);
        logger.info(GSON.toJson(bean));
    }
}

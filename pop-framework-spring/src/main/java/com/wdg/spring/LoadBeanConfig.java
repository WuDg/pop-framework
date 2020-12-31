package com.wdg.spring;

import com.google.gson.Gson;
import com.wdg.spring.bean.ExampleBean;
import com.wdg.spring.bean.ThingOne;
import com.wdg.spring.bean.UserBean;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @description: ∂¡»°spring≈‰÷√¿‡
 * @author: WuDG/1490727316@qq.com
 * @date: 2020/12/31 11:19
 */
public class LoadBeanConfig {
    private static final Gson GSON = new Gson();
    private static final Logger logger = Logger.getLogger(LoadBeanConfig.class);
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
////        UserBean bean = context.getBean(UserBean.class);
//        UserBean userBean1 = context.getBean("userBean1",UserBean.class);
//        logger.info(GSON.toJson(userBean1));

        GenericApplicationContext context1 = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context1).loadBeanDefinitions("bean.xml");
        context1.refresh();
        UserBean userBean6 = context1.getBean("userBean7", UserBean.class);
        ExampleBean exampleBean = context1.getBean("exampleBean", ExampleBean.class);
        ThingOne thingOne = context1.getBean("beanOne", ThingOne.class);
        logger.info(GSON.toJson(userBean6));
        logger.info(GSON.toJson(exampleBean));
        logger.info(GSON.toJson(thingOne));
    }
}

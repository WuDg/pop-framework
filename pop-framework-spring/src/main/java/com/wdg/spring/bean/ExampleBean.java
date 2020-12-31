package com.wdg.spring.bean;

import lombok.Data;

import java.beans.ConstructorProperties;

/**
 * @description:
 * @author: WuDG/1490727316@qq.com
 * @date: 2020/12/31 13:30
 */
@Data
public class ExampleBean {

    // Number of years to calculate the Ultimate Answer
    private int years;

    // The Answer to Life, the Universe, and Everything
    private String ultimateAnswer;

    @ConstructorProperties({"years", "ultimateAnswer"})
    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }
}
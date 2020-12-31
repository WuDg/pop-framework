package com.wdg.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: WuDG/1490727316@qq.com
 * @date: 2020/12/31 13:28
 */
public class ThingOne {
    private ThingTwo thingTwo;
    private ThingThree thingThree;

    public ThingTwo getThingTwo() {
        return thingTwo;
    }

    public void setThingTwo(ThingTwo thingTwo) {
        this.thingTwo = thingTwo;
    }

    public ThingThree getThingThree() {
        return thingThree;
    }

    public void setThingThree(ThingThree thingThree) {
        this.thingThree = thingThree;
    }

    public ThingOne(ThingTwo thingTwo, ThingThree thingThree) {
        this.thingTwo = thingTwo;
        this.thingThree = thingThree;
    }

    public ThingOne() {
    }
}

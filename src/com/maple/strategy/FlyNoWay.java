package com.maple.strategy;

/**
 * @author San
 * @time 2021/8/24 7:24 上午
 * @desc
 */
public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can`t fly");
    }
}

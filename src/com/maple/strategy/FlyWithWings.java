package com.maple.strategy;

/**
 * @author San
 * @time 2021/8/24 7:23 上午
 * @desc
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I`m flying!!");
    }
}

package com.maple.strategy;

/**
 * @author San
 * @time 2021/8/24 12:27 下午
 * @desc
 */
public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I`m flying with a rocket!");
    }
}

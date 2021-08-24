package com.maple.strategy;

/**
 * @author San
 * @time 2021/8/24 7:28 上午
 * @desc
 */
public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}

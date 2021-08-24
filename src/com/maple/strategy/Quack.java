package com.maple.strategy;

/**
 * @author San
 * @time 2021/8/24 7:26 上午
 * @desc
 */
public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}

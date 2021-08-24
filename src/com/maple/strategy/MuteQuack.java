package com.maple.strategy;

/**
 * @author San
 * @time 2021/8/24 7:27 上午
 * @desc
 */
public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

package com.maple.strategy;

/**
 * @author San
 * @time 2021/8/24 7:34 上午
 * @desc
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I`m a real Mallard duck");
    }
}

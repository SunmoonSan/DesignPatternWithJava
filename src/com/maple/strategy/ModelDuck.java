package com.maple.strategy;

/**
 * @author San
 * @time 2021/8/24 12:25 下午
 * @desc
 */
public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I`m a model duck");
    }
}

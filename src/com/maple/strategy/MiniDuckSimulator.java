package com.maple.strategy;

/**
 * @author San
 * @time 2021/8/24 7:33 上午
 * @desc
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
//        Duck mallard = new MallardDuck();
//        mallard.performQuack();
//        mallard.performFly();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
    }
}

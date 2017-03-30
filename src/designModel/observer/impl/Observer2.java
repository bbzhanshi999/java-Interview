package designModel.observer.impl;

import designModel.observer.Observer;

/**
 * Created by jilili on 2017/3/29.
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("update from Observer2");
    }
}

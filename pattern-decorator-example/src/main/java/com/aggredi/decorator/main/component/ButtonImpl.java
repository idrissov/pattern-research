package com.aggredi.decorator.main.component;

/**
 * Created by Serik Idrissov
 * 12/20/15
 */
public class ButtonImpl implements Button {
    @Override
    public void onMouseMoveThrough() {
        System.out.println("Default");
    }

    @Override
    public void onKeyPress() {
        System.out.println("Do something");
    }
}

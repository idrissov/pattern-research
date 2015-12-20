package com.aggredi.decorator;

import com.aggredi.decorator.main.component.Button;

/**
 * Created by Serik Idrissov
 * 12/20/15
 */
public class RedColorButtonDecorator extends ButtonDecorator {
    public RedColorButtonDecorator(Button button) {
        super(button);
    }

    @Override
    public void onMouseMoveThrough() {
        System.out.println("Red");
        super.button.onMouseMoveThrough();
    }
}

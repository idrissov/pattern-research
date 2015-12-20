package com.aggredi.decorator;

import com.aggredi.decorator.main.component.Button;

/**
 * Created by Serik Idrissov
 * 12/20/15
 */
public class BlackColorButtonDecorator extends ButtonDecorator {
    public BlackColorButtonDecorator(Button button) {
        super(button);
    }

    @Override
    public void onMouseMoveThrough() {
        System.out.println("Black color");
        super.button.onMouseMoveThrough();
    }
}

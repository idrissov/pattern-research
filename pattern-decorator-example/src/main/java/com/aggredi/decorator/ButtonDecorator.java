package com.aggredi.decorator;

import com.aggredi.decorator.main.component.Button;
import com.aggredi.decorator.main.component.ButtonImpl;

import javax.swing.*;

/**
 * Created by Serik Idrissov
 * 12/20/15
 */
public abstract class ButtonDecorator implements Button {
    public ButtonDecorator(Button button) {
        this.button = button;
    }

    protected Button button;

    @Override
    public abstract void onMouseMoveThrough();

    @Override
    public void onKeyPress() {
        button.onKeyPress();
    }
}

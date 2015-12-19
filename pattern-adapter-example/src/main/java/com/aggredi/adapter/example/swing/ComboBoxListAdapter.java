package com.aggredi.adapter.example.swing;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serik Idrissov
 * 12/19/15
 */
public class ComboBoxListAdapter<T> extends DefaultListModel<T> {

    private DefaultComboBoxModel<T> adaptee;

    public ComboBoxListAdapter(DefaultComboBoxModel<T> adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void addElement(T element) {
        super.addElement(element);
        adaptee.addElement(element);
    }


}

package com.aggredi.adapter.example.type1.adapter;

import com.aggredi.adapter.example.type1.StackIF;

import java.util.List;

/**
 * Created by Serik Idrissov
 * 12/12/15
 */
public class ListStackAdapter<T> implements StackIF<T> {

    private List<T> stackStorage;

    public ListStackAdapter(List<T> stackStorage) {
        this.stackStorage = stackStorage;
    }

    /**
     * @inheritDoc
     */
    @Override
    public T pop() {
        T lastObj = null;
        if (!stackStorage.isEmpty()) {
            lastObj = stackStorage.get(stackStorage.size() - 1);
            stackStorage.remove(stackStorage.size() - 1);
        }
        return lastObj;
    }

    /**
     * @inheritDoc
     */
    @Override
    public void push(T element) {
        stackStorage.add(element);
    }

}

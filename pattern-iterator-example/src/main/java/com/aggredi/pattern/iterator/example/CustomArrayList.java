package com.aggredi.pattern.iterator.example;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Serik Idrissov
 * 12/13/15
 */
public class CustomArrayList<T> extends ArrayList<T>{

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return new IteratorImpl();
    }



    private class IteratorImpl implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return CustomArrayList.this.size() > 0;
        }

        @Override
        public T next() {
            T t = CustomArrayList.this.get(size() - 1);
            CustomArrayList.this.remove(t);
            return t;
        }
    }


}

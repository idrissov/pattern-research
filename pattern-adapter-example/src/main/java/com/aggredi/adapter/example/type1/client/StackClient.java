package com.aggredi.adapter.example.type1.client;

import com.aggredi.adapter.example.type1.StackIF;

/**
 * Created by Serik Idrissov
 * 12/12/15
 *
 * Class has role Client in Adapter pattern
 */
public class StackClient {


    /**
     *
     * Just fictional logic
     *
     * */
    public static <T extends Number> long multiply(StackIF<T> numbersToSum) {
        long result = 0;

        T lastElement;
        boolean isFirstLoop = true;

        while ((lastElement = numbersToSum.pop()) != null) {
            if (isFirstLoop) {
                result = lastElement.longValue();
                isFirstLoop = false;
            } else {
                result *= lastElement.longValue();
            }
        }
        return result;
    }
}

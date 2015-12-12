package com.aggredi.type1;

import com.aggredi.adapter.example.type1.adapter.ListStackAdapter;
import com.aggredi.adapter.example.type1.client.StackClient;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Serik Idrissov
 * 12/12/15
 */
public class TestAdapter {

    @Test
    public void testShouldReturnZero() {
        ListStackAdapter<Integer> listStackAdapter = new ListStackAdapter<>(new ArrayList<Integer>());
        listStackAdapter.push(1);
        listStackAdapter.push(2);
        listStackAdapter.push(3);
        listStackAdapter.push(0);
        long multiply = StackClient.multiply(listStackAdapter);
        Assert.assertEquals(multiply, 0);
    }

    @Test
    public void testShouldReturn6() {
        ListStackAdapter<Integer> listStackAdapter = new ListStackAdapter<>(new ArrayList<Integer>());
        listStackAdapter.push(1);
        listStackAdapter.push(2);
        listStackAdapter.push(3);
        long multiply = StackClient.multiply(listStackAdapter);
        Assert.assertEquals(multiply, 6);
    }


}

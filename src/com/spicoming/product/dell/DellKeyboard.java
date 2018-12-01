package com.spicoming.product.dell;

import com.spicoming.product.Keyboard;

/**
 * Created by NJTZ on 2018/12/1.
 */
public class DellKeyboard implements Keyboard {
    @Override
    public void inputWords() {
        System.out.println("DellKeyboard can input words as orther any model of keyboard!");
    }
}

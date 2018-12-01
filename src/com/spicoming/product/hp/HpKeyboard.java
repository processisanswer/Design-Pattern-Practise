package com.spicoming.product.hp;

import com.spicoming.product.Keyboard;

/**
 * Created by NJTZ on 2018/12/1.
 */
public class HpKeyboard implements Keyboard {
    @Override
    public void inputWords() {
        System.out.println("HpKeyboard can input words!");
    }
}

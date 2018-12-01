package com.spicoming.factory.impl;

import com.spicoming.factory.InputDeviceFactory;
import com.spicoming.product.Keyboard;
import com.spicoming.product.Mouse;
import com.spicoming.product.hp.HpKeyboard;
import com.spicoming.product.hp.HpMouse;

/**
 * Created by NJTZ on 2018/12/1.
 */
public class HpMouseFactory implements InputDeviceFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }
}

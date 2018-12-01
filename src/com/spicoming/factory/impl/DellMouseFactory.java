package com.spicoming.factory.impl;

import com.spicoming.factory.InputDeviceFactory;
import com.spicoming.product.Keyboard;
import com.spicoming.product.Mouse;
import com.spicoming.product.dell.DellKeyboard;
import com.spicoming.product.dell.DellMouse;

/**
 * Created by NJTZ on 2018/12/1.
 */
public class DellMouseFactory implements InputDeviceFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}

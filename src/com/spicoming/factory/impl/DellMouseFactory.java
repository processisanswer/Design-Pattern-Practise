package com.spicoming.factory.impl;

import com.spicoming.factory.MouseFactory;
import com.spicoming.product.Mouse;
import com.spicoming.product.dell.DellMouse;

/**
 * Created by NJTZ on 2018/12/1.
 */
public class DellMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}

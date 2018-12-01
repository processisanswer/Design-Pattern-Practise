package com.spicoming.product.dell;

import com.spicoming.product.Mouse;

/**
 * Created by NJTZ on 2018/12/1.
 */
public class DellMouse implements Mouse {

    @Override
    public void sayHi() {
        System.out.println("DellMouse say Hi ...");
    }
}

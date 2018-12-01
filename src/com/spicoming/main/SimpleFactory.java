package com.spicoming.main;

import com.spicoming.factory.MouseFactory;
import com.spicoming.product.Mouse;

/**
 * Created by NJTZ on 2018/12/1.
 * simple factory pattern
 */
public class SimpleFactory {

    public static void main(String[] args) {
        MouseFactory mouseFactory=new MouseFactory();
        Mouse mouse = mouseFactory.createMouse("hp");
        if (mouse!=null)
        mouse.sayHi();
        else{
            System.out.println("model is not exist!");
        }

    }
}

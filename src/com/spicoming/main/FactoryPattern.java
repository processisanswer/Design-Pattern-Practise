package com.spicoming.main;

import com.spicoming.factory.MouseFactory;
import com.spicoming.factory.impl.DellMouseFactory;
import com.spicoming.factory.impl.HpMouseFactory;
import com.spicoming.product.Mouse;

/**
 * Created by NJTZ on 2018/12/1.
 * factory pattern
 * don't input args,but create product by new implemented class of factory
 */
public class FactoryPattern {

    public static void main(String[] args) {
        //dell
        MouseFactory mouseFactory1=new DellMouseFactory();
        mouseFactory1.createMouse().sayHi();
        //hp
        MouseFactory mouseFactory2=new HpMouseFactory();
        mouseFactory2.createMouse().sayHi();

    }
}

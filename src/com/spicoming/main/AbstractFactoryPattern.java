package com.spicoming.main;

import com.spicoming.factory.InputDeviceFactory;
import com.spicoming.factory.impl.DellMouseFactory;
import com.spicoming.factory.impl.HpMouseFactory;
import com.spicoming.product.Mouse;

/**
 * Created by NJTZ on 2018/12/1.
 * abstract factory pattern
 * more than one type of product
 * when the type of product need to procuce is only one ,
 * abstract factory pattern become factory pattern
 */
public class AbstractFactoryPattern {

    public static void main(String[] args) {
        //hp
        HpMouseFactory hpHactory = new HpMouseFactory();
        hpHactory.createMouse().sayHi();
        hpHactory.createKeyboard().inputWords();
        //dell
        InputDeviceFactory dellDeviceFactory=new DellMouseFactory();
        dellDeviceFactory.createMouse().sayHi();
        dellDeviceFactory.createKeyboard().inputWords();

    }
}

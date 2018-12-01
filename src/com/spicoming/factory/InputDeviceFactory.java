
package com.spicoming.factory;

import com.spicoming.product.Keyboard;
import com.spicoming.product.dell.DellMouse;
import com.spicoming.product.hp.HpMouse;
import com.spicoming.product.Mouse;

/**
 * Created by NJTZ on 2018/12/1.
 * abstract factory pattern
 * produce interface
 * products need to produce is more than one type
 */
public interface InputDeviceFactory {
   Mouse createMouse();
   Keyboard createKeyboard();
}

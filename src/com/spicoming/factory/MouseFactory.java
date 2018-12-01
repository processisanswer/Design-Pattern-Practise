
package com.spicoming.factory;

import com.spicoming.product.dell.DellMouse;
import com.spicoming.product.hp.HpMouse;
import com.spicoming.product.Mouse;

/**
 * Created by NJTZ on 2018/12/1.
 * factory pattern
 * produce interface
 */
public interface MouseFactory {
   Mouse createMouse();
}

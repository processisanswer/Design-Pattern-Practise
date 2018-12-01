
package com.spicoming.factory;

import com.spicoming.product.DellMouse;
import com.spicoming.product.HpMouse;
import com.spicoming.product.Mouse;

/**
 * Created by NJTZ on 2018/12/1.
 */
public class MouseFactory {
    public Mouse createMouse(String model){
        if(model==null){
            return null;
        }else if("hp".equals(model)){
            return new HpMouse();
        }else if ("dell".equals(model)){
            return new DellMouse();
        }
        return null;
    }
}

package com.bjpowernode.factory;

import com.bjpowernode.service.UsbSell;

/**
 * @Project:proxy-program
 * @author:PastoralCat
 * @data:2022/1/8
 */
public class UsbKingFactory implements UsbSell {

    @Override
    public float sell(int amount) {
        return 0;
    }
}

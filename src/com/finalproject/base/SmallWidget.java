package com.finalproject.base;

import com.finalproject.ProductType;
import com.finalproject.SurfaceColor;
import singleton.SerialNumber;

public class SmallWidget extends AbstractWidget{

    public SmallWidget(SurfaceColor color) {super(color);
        this.serialNumber = SerialNumber.getInstance()
                .getNextSerial(ProductType.SMALLWIDGET);
    }
    @Override
    public String getGears(){
        return "2 Gears ";
    }
    @Override
    public String getSprings(){
        return "3 Gears ";
    }
    @Override
    public String getLevers(){
        return " 1 Lever ";
    }
}


package com.finalproject.base;

import com.finalproject.ProductType;
import com.finalproject.SurfaceColor;
import singleton.SerialNumber;

public class LargeWidget extends AbstractWidget{
        public LargeWidget (SurfaceColor color){
            super (color);
            }

    public LargeWidget(SurfaceColor color) {super(color);
        this.serialNumber = SerialNumber.getInstance()
                .getNextSerial (ProductType.LargeWidget);
    }
    @Override
    public String getGears(){
        return "9 Gears ";
    }
    @Override
    public String getSprings(){
    }
    @Override
    public String getLevers(){
        return " 2 Levers ";
    }
}

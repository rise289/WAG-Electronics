package com.finalproject.base;


import com.finalproject.ProductType;
import com.finalproject.SurfaceColor;
import singleton.SerialNumber;

public class MediumWidget extends AbstractWidget{

    public MediumWidget(SurfaceColor color) {super(color);
    this.serialNumber = SerialNumber.getInstance()
            .getNextSerial (ProductType.MEDIUMWIDGET);
}
    @Override
    public String getGears() {
        return "4 Gears ";
    }

    @Override
    public String getSprings(){
        return "5 Springs ";
    }
    @Override
    public String getLevers(){

        return " 3 Levers ";
    }
}
package com.finalproject.base;

import com.finalproject.ProductType;
import com.finalproject.SurfaceColor;
import singleton.SerialNumber;

import java.util.ArrayList;
import java.util.List;

public class SmallGadget extends AbstractGadget {


    public SmallGadget(SurfaceColor color) {
        super(color);
        this.serialNumber = SerialNumber.getInstance()
        .getNextSerial(ProductType.SMALLGADGET);
    }

    @Override
    public List<WidgetInterface> getWidgets(SurfaceColor color) {
        List<WidgetInterface> myList = new ArrayList<>();
        myList.add(new LargeWidget(color));
        myList.add(new LargeWidget(color));
        myList.add(new LargeWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new SmallWidget(color));
        myList.add(new SmallWidget(color));
        myList.add(new SmallWidget(color));
        return myList;
    }

    @Override
    public int getSwitches() {
        return 1;
    }

    @Override
    public int getButtons() {
        return 2;
    }

    @Override
    public int getLights() {
        return 0;
    }

    @Override
    public String getPowerSource() {
        return "Generator";
    }

    @Override
    public float getPrice() {
        return 42.97F;
    }
}


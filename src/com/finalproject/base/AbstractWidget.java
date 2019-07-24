package com.finalproject.base;

import com.finalproject.SurfaceColor;

public abstract class AbstractWidget implements WidgetInterface {

    private SurfaceColor color;
    protected String serialNumber;

    public AbstractWidget(SurfaceColor color) {
        this.color = color;
    }

    public SurfaceColor getColor() {
        return color;
    }

    @Override
    public String getSerialNumber() {
        return serialNumber;
    }

}


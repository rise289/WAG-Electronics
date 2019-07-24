package com.finalproject.base;

import com.finalproject.SurfaceColor;

public abstract class AbstractGadget implements GadgetInterface{

    private SurfaceColor color;
    protected String serialNumber;

    public AbstractGadget() {
        this(SurfaceColor.PLAIN);
    }

    public AbstractGadget(SurfaceColor color) {
        this.color = color;
    }

    public SurfaceColor getColor() {
        return color;
    }
    @Override
    public String getSerialNumber(){
        return serialNumber;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " was added to the order ";
    }


    }






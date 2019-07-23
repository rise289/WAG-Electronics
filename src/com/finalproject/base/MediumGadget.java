package com.finalproject.base;

public class MediumGadget extends AbstractGadget{
}

    public MediumGadget(WidgetInterface widget, GadgetColor color){
        super(widget, color);
    } //end method

    public MediumGadget(WidgetInterface widget) {
        this(widget, GadgetColor.ORANGE);
    } //end method

    @Override
    public float getPrice(){
        return 850.00f;
    } //end method
} //end class


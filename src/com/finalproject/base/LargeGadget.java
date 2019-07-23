package com.finalproject.base;

public class LargeGadget extends AbstractGadget {
}

    public LargeGadget(WidgetInterface widget, GadgetColor color){
        super(widget, color);
    } //end method

    public LargeGadget(WidgetInterface widget) {
        this(widget, GadgetColor.ORANGE);
    } //end method

    @Override
    public float getPrice(){
        return 850.00f;
    } //end method
} //end class

package com.finalproject.base;

public class LargeGadget extends AbstractGadget {
}

    public LargeGadget(WidgetInterface widget, GadgetColor color){
        super(widget, color);
    } //end method

    public LargeGadget(WidgetInterface widget) {
        this(widget, GadgetColor.color);
    } //end method

    @Override
    public float getPrice(){
        return 82.97f;
    } //end method
} //end class

package com.finalproject.base;

import com.finalproject.java.GadgetColor;

public interface GadgetInterface {

    WidgetInterface getWidget();
    GadgetColor getColor();
    float getPrice();
    void paint(GadgetColor color);

   /* void typeSwitch();
    void typeButton();
    void typeLight();*/
}

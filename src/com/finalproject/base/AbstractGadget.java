package com.finalproject.base;

public abstract class AbstractGadget implements GadgetInterface{

        private WidgetInterface widget;
        private GadgetColor color;

        protected AbstractGadget(WidgetInterface widget, GadgetColor color){
            this.widget = widget;
            this.color = color;
        }

        protected AbstractGadget (WidgeInterface widget){
            this(widget,GadgetColor.UNPAINTED);
        }

        @Override
        public WidgeInterface getWidget() {
            return widget;
        }

        @Override
        public GadgetColor getColor() {
            return color;
        }

        @Override
        public void paint(GadgetColor color) {
            this.color=color;
        }

        @Override
        public float getPrice(){
            return 82.97f;
        }

        /*@Override
        public void cleanFrame() {
            System.out.println("Cleaning Frame......");
        }

        @Override
        public void airTires() {
            System.out.println("Airing up Tires......");
        }

        @Override
        public void testRide() {
            System.out.println("Taking bike out for a test ride......");
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() +
                    " ("+widget+", "+color+", price = $"+getPrice()+")";
        }*/
    } // end class







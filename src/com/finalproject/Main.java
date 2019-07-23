package com.finalproject;


import singleton.SerialNumber;

public class Main {

    public static void main(String[] args) {
	// write your code here

        singletonExample();

    }

    private static void singletonExample(){
        System.out.println("Generating Serial Numbers");
        SerialNumber generator = SerialNumber.getInstance();
        System.out.println("next serial = "+generator.getNextSerial());
        System.out.println("next serial = "+generator.getNextSerial());
        System.out.println("next serial = "+generator.getNextSerial());
        System.out.println("next serial = "+generator.getNextSerial());
    } //end method

    public static void singletonExample() {
        SerialNumber mySerialNumber = new SerialNumber();
        mySerialNumber.MediumGadget(SerialNumber.SurfaceType.PLAIN);
}
/*

    private static void observerExample2(){
        com.designpatterns.observer2.Speedometer speed
                = new com.designpatterns.observer2.Speedometer();
        speed.addSpeedometerListener(new com.designpatterns.observer2.SpeedMonitor());
        speed.addSpeedometerListener(new com.designpatterns.observer2.GearBox());
        speed.setCurrentSpeed(5);
        speed.setCurrentSpeed(10);
        speed.setCurrentSpeed(20);
        speed.setCurrentSpeed(30);
        speed.setCurrentSpeed(35);
    } */
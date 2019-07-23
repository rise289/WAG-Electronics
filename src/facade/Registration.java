package facade;

import com.finalproject.base.GadgetInterface;
import singleton.SerialNumber;

public class Registration {
    private GadgetInterface gadget;

    Registration(GadgetInterface gadget) {
        this.gadget = gadget;
    }


    public void allocatingGadgetNumber(){
        SerialNumber generator = SerialNumber.getInstance();
        System.out.println("Allocating Gadget Number "+generator.getNextSerial());
    }

}

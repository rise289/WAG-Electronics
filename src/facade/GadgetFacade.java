package facade;

import com.finalproject.base.GadgetInterface;

public class GadgetFacade {
}
    public void prepareForSale(GadgetInterface gadget) {
        Registration reg = new Registration(gadget);
        reg.allocatingGadgetNumber();
        Documentation.printBrochure();
        gadget.Switch();
        gadget.Button();
        gadget.Light();
    }
}

package visitor;

import com.finalproject.base.WidgetInterface;
import singleton.SerialNumber;

public interface WidgetVisitorInterface {

    void visit(WidgetInterface widget);
    void visit(Gears gears);
    void visit(Springs springs);
    void visit(Levers levers);
    void visit(SerialNumber serialNumber);
}



package singleton;

import com.finalproject.ProductType;

public class SerialNumber {

        private static SerialNumber instance;
        private String serialPrefix;
        private int count;

        public synchronized static SerialNumber getInstance() {
            if (instance == null) {
                instance = new SerialNumber();
            }
            return instance;
        }

        private SerialNumber() {
        }

        public synchronized String getNextSerial(ProductType type) {
            int value;
            switch (type) {
                case LARGEGADGET:
                    serialPrefix = "06LRG";
                    count = 3467;
                    value = ++count;
                    return serialPrefix + value;
                case MEDIUMGADGET:
                    serialPrefix = "04MED";
                    count = 2356;
                    value = ++count;
                    return serialPrefix + value;
                case SMALLGADGET:
                    serialPrefix = "02SML";
                    count = 1245;
                    value = ++count;
                    return serialPrefix + value;
                case LARGEWIDGET:
                    serialPrefix = "66LRG";
                    count = 3568;
                    value = ++count;
                    return serialPrefix + value;
                case MEDIUMWIDGET:
                    serialPrefix = "44MED";
                    count = 2457;
                    value = ++count;
                    return serialPrefix + value;
                case SMALLWIDGET:
                    serialPrefix = "22SML";
                    count = 1346;
                    value = ++count;
                    return serialPrefix + value;
                default:
                    return "No type specified";
            }
        }
    }
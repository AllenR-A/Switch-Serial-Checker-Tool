package com.switchcheck;

import com.switchcheck.SerialPatchFactory.Switch;
import com.switchcheck.SerialPatchFactory.SwitchFactory;

/**
 * This uses Factory Design Pattern
 */
public class SerialFactory {
    /**
     * SwitchSerialFactory() will act like main() in Factory Design Pattern
     * @param serial Takes in a serial number of the format "XXX00000000000" | 3 Letters & 11 Numbers
     * @return This returns a String message
     */
    public static String SwitchSerialFactory(String serial){
        SwitchFactory switchFactory = new SwitchFactory();
        if (serial.substring(1,3).equals("AJ")){
            Switch switch1 = switchFactory.getSwitch("Erista-Unpatched");
            return switch1.inform();
        } else if(serial.substring(1,3).equals("AW")) {
            Switch switch1 = switchFactory.getSwitch("Erista-Maybe");
            return switch1.inform();
        } else if(serial.substring(1,3).equals("AK")) {
            Switch switch1 = switchFactory.getSwitch("Erista-Patched");
            return switch1.inform();
        } else if(serial.charAt(1) == 'K') {
            Switch switch1 = switchFactory.getSwitch("Mariko-Patched");
            return switch1.inform();
        } else if(serial.charAt(1) == 'J') {
            Switch switch1 = switchFactory.getSwitch("MarikoLite-Patched");
            return switch1.inform();
        }
        return "";
    }

}

package com.switchcheck;

import com.switchcheck.SerialPatchFactory.SwitchF;
import com.switchcheck.SerialPatchFactory.SwitchFactory;

import static com.switchcheck.EristaPatchCheck.patchCheck;

/**
 * This tells the user whether their system is patched or not.
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
        String assemblyLine = serial.substring(2,5);
        String number = serial.substring(5);
        if(serial.charAt(1) == 'K') {
            SwitchF switch1 = switchFactory.getSwitch("Mariko-Patched");
            return switch1.inform();
        } else if(serial.charAt(1) == 'J') {
            SwitchF switch1 = switchFactory.getSwitch("MarikoLite-Patched");
            return switch1.inform();
        } else if (serial.charAt(3) == '9') {
            SwitchF switch1 = switchFactory.getSwitch("Refurbished-Maybe");
            return switch1.inform();
        } else if(patchCheck(assemblyLine, number).equals("Unpatched")){
            SwitchF switch1 = switchFactory.getSwitch("Erista-Unpatched");
            return switch1.inform();
        } else if(patchCheck(assemblyLine, number).equals("Maybe")) {
            SwitchF switch1 = switchFactory.getSwitch("Erista-Maybe");
            return switch1.inform();
        } else if(patchCheck(assemblyLine, number).equals("Korean")) {
            SwitchF switch1 = switchFactory.getSwitch("EristaK-Maybe");
            return switch1.inform();
        } else if(patchCheck(assemblyLine, number).equals("Patched")) {
            SwitchF switch1 = switchFactory.getSwitch("Erista-Patched");
            return switch1.inform();
        }
        return "";
    }

}

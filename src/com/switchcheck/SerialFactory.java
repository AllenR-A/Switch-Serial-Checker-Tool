package com.switchcheck;

import com.switchcheck.SerialPatchFactory.SwitchFactoryInterface;
import com.switchcheck.SerialPatchFactory.SwitchFactory;

import static com.switchcheck.EristaPatchCheck.patchCheck;

/**
 * This tells the user whether their system is patched or not.
 * This uses Factory Design Pattern
 * @author Allen Royce Aleta
 */
public class SerialFactory {
    /**
     * SwitchSerialFactory() will act like main() in Factory Design Pattern
     * @author Allen Royce Aleta
     * @param serial Takes in a serial number of the format "XXX00000000000" | 3 Letters & 11 Numbers
     * @return This returns a String message
     */
    public static String SwitchSerialFactory(String serial){
        SwitchFactory switchFactory = new SwitchFactory();
        String assemblyLine = serial.substring(2,5);
        String number = serial.substring(5);
        //These need to trigger first (since K, J, & 9 could be seen first -if they appear- in the serial number)
        if(serial.charAt(1) == 'K') {
            SwitchFactoryInterface switch1 = switchFactory.getSwitch("Mariko-Patched");
            return switch1.inform();
        } else if(serial.charAt(1) == 'J') {
            SwitchFactoryInterface switch1 = switchFactory.getSwitch("MarikoLite-Patched");
            return switch1.inform();
        } else if (serial.charAt(3) == '9') {
            SwitchFactoryInterface switch1 = switchFactory.getSwitch("Refurbished-Maybe");
            return switch1.inform();
        }
        //These need to trigger last (uses EristaPatchCheck.patchCheck() method)
          else if(patchCheck(assemblyLine, number).equals("Unpatched")){
            SwitchFactoryInterface switch1 = switchFactory.getSwitch("Erista-Unpatched");
            return switch1.inform();
        } else if(patchCheck(assemblyLine, number).equals("Maybe")) {
            SwitchFactoryInterface switch1 = switchFactory.getSwitch("Erista-Maybe");
            return switch1.inform();
        } else if(patchCheck(assemblyLine, number).equals("Korean")) {
            SwitchFactoryInterface switch1 = switchFactory.getSwitch("EristaK-Maybe");
            return switch1.inform();
        } else if(patchCheck(assemblyLine, number).equals("Patched")) {
            SwitchFactoryInterface switch1 = switchFactory.getSwitch("Erista-Patched");
            return switch1.inform();
        }
        return "";
    }
}

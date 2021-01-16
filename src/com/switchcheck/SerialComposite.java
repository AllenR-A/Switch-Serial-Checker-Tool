package com.switchcheck;

import com.switchcheck.SerialInformationComposite.*;

/**
 * This tells the user whether their system is patched or not + other information.
 * This uses Composite Design Pattern
 */
public class SerialComposite {
    /**
     * SwitchSerialComposite() will act like main() in Composite Design Pattern
     * @param serial Takes in a serial number of the format "XXX00000000000" | 3 Letters & 11 Numbers
     * @return This returns a String message
     */
    public static String SwitchSerialComposite(String serial){
        SwitchC switchCom1 = new SwitchComposite();
        if (serial.charAt(1)=='A'){
            if (serial.charAt(2)=='J'){
                SwitchC switch1 = new Erista_v1("Erista (v1)", "Japan", serial.substring(2,5), serial.substring(5), serial);
                switchCom1.add(switch1);
                switchCom1.print();
            } else if (serial.charAt(2)=='W'){
                SwitchC switch1 = new Erista_v1("Erista (v1)", "Western Countries", serial.substring(2,5), serial.substring(5), serial);
                switchCom1.add(switch1);
                switchCom1.print();
            } else if (serial.charAt(2)=='K'){
                SwitchC switch1 = new Erista_v1("Erista (v1)", "Korea", serial.substring(2,5), serial.substring(5), serial);
                switchCom1.add(switch1);
                switchCom1.print();
            }
        } else if (serial.charAt(1)=='K'){
            if (serial.charAt(2)=='J'){
                SwitchC switch1 = new Mariko_v2("Mariko (v2)", "Japan", serial.substring(2,5), serial.substring(5), serial);
                switchCom1.add(switch1);
                switchCom1.print();
            } else if (serial.charAt(2)=='W'){
                SwitchC switch1 = new Mariko_v2("Mariko (v2)", "Western Countries", serial.substring(2,5), serial.substring(5), serial);
                switchCom1.add(switch1);
                switchCom1.print();
            } else if (serial.charAt(2)=='K'){
                SwitchC switch1 = new Mariko_v2("Mariko (v2)", "Korea", serial.substring(2,5), serial.substring(5), serial);
                switchCom1.add(switch1);
                switchCom1.print();
            }
        } else if (serial.charAt(1)=='J'){
            if (serial.charAt(2)=='J'){
                SwitchC switch1 = new MarikoLite_v2("Lite (v2)", "Japan", serial.substring(2,5), serial.substring(5), serial);
                switchCom1.add(switch1);
                switchCom1.print();
            } else if (serial.charAt(2)=='W'){
                SwitchC switch1 = new MarikoLite_v2("Lite (v2)", "Western Countries", serial.substring(2,5), serial.substring(5), serial);
                switchCom1.add(switch1);
                switchCom1.print();
            } else if (serial.charAt(2)=='K'){
                SwitchC switch1 = new MarikoLite_v2("Lite (v2)", "Korea", serial.substring(2,5), serial.substring(5), serial);
                switchCom1.add(switch1);
                switchCom1.print();
            }
        } else {
            return "huh, this is new... Is that the rumored Switch Pro?";
        }
        return "";
    }
}

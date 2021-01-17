package com.switchcheck;

import com.switchcheck.SerialInformationComposite.*;

/**
 * This tells the user whether their system is patched or not + other information.
 * This uses Composite Design Pattern.
 * @author Allen Royce Aleta
 */
public class SerialComposite {
    /**
     * SwitchSerialComposite() will act like main() in Composite Design Pattern.
     * This creates the appropriate leaf node objects depending on the serial number
     * then the Composite [a SwitchCompositeInterface object] will add them to a list
     * (only one in a list), which is then printed.
     *
     * empty return statement is at the end to make this compile
     *
     * @author Allen Royce Aleta
     * @param serial Takes in a serial number of the format "XXX00000000000" | 3 Letters & 11 Numbers
     * @return This returns a String message
     */
    public static String SwitchSerialComposite(String serial){
        SwitchCompositeInterface switchCom1 = new SwitchComposite();
        if (serial.charAt(1)=='A'){         //If Erista (v1)
            if (serial.charAt(2)=='J'){         //J for JJapan
                SwitchCompositeInterface switch1 = new Erista_v1("Erista (v1)", "Japan", serial.substring(2,5), serial.substring(5), serial);
                switchCom1.add(switch1);
                switchCom1.print();
            } else if (serial.charAt(2)=='W'){  //W for Western Countries
                SwitchCompositeInterface switch1 = new Erista_v1("Erista (v1)", "Western Countries", serial.substring(2,5), serial.substring(5), serial);
                switchCom1.add(switch1);
                switchCom1.print();
            } else if (serial.charAt(2)=='K'){  //K for Korea
                SwitchCompositeInterface switch1 = new Erista_v1("Erista (v1)", "Korea", serial.substring(2,5), serial.substring(5), serial);
                switchCom1.add(switch1);
                switchCom1.print();
            }
        } else if (serial.charAt(1)=='K'){  //If Mariko (v2)
            if (serial.charAt(2)=='J'){         //J for JJapan
                SwitchCompositeInterface switch1 = new Mariko_v2("Mariko (v2)", "Japan", serial.substring(2,5), serial.substring(5), serial);
                switchCom1.add(switch1);
                switchCom1.print();
            } else if (serial.charAt(2)=='W'){  //W for Western Countries
                SwitchCompositeInterface switch1 = new Mariko_v2("Mariko (v2)", "Western Countries", serial.substring(2,5), serial.substring(5), serial);
                switchCom1.add(switch1);
                switchCom1.print();
            } else if (serial.charAt(2)=='K'){  //K for Korea
                SwitchCompositeInterface switch1 = new Mariko_v2("Mariko (v2)", "Korea", serial.substring(2,5), serial.substring(5), serial);
                switchCom1.add(switch1);
                switchCom1.print();
            }
        } else if (serial.charAt(1)=='J'){  //If Lite (v2)
            if (serial.charAt(2)=='J'){         //J for Japan
                SwitchCompositeInterface switch1 = new MarikoLite_v2("Lite (v2)", "Japan", serial.substring(2,5), serial.substring(5), serial);
                switchCom1.add(switch1);
                switchCom1.print();
            } else if (serial.charAt(2)=='W'){  //W for Western Countries
                SwitchCompositeInterface switch1 = new MarikoLite_v2("Lite (v2)", "Western Countries", serial.substring(2,5), serial.substring(5), serial);
                switchCom1.add(switch1);
                switchCom1.print();
            } else if (serial.charAt(2)=='K'){  //K for Korea
                SwitchCompositeInterface switch1 = new MarikoLite_v2("Lite (v2)", "Korea", serial.substring(2,5), serial.substring(5), serial);
                switchCom1.add(switch1);
                switchCom1.print();
            }
        } else {
            return "huh, this is new... Is this the rumored Switch Pro?";
        }
        return "";
    }
}

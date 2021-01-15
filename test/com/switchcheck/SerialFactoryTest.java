package com.switchcheck;

import com.switchcheck.SerialPatchFactory.Switch;
import com.switchcheck.SerialPatchFactory.SwitchFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SerialFactoryTest {

    @Test
    void CreateSwitch(){
        String serial = "MarikoLite-Patched";
        SwitchFactory switchFactory = new SwitchFactory();
        Switch switch1 = switchFactory.getSwitch(serial);
        switch (serial){
            case "Erista-Unpatched":
                assertEquals("It's Unpatched!", switch1.inform());
                break;
            case "Erista-Maybe":
                assertEquals("Maybe", switch1.inform());
                break;
            case "Erista-Patched":
                assertEquals("It's Patched", switch1.inform());
                break;
            case "Mariko-Patched":
                assertEquals("It's Really Patched", switch1.inform());
                break;
            case "MarikoLite-Patched":
                assertEquals("It's Really Patched (smol)", switch1.inform());
                break;
            default:
                System.out.println("default ran");
        }


    }
}
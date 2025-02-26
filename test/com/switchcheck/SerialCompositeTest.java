package com.switchcheck;

import com.switchcheck.SerialInformationComposite.*;
import org.junit.jupiter.api.Test;

class SerialCompositeTest {

    @Test
    void switchSerialComposite() {
        SwitchCompositeInterface switch1 = new Erista_v1("Erista (v1)", "Japan", "J10", "000000000", "XAJ10000000000");
        SwitchCompositeInterface switch2 = new Mariko_v2("Mariko (v2)", "Japan", "J10", "028090000", "XKJ10028090000");
        SwitchCompositeInterface switch3 = new Mariko_v2("Mariko (v2)", "Japan", "J90", "045050000", "XKJ90045050000");
        SwitchCompositeInterface switch4 = new MarikoLite_v2("Lite (v2)", "Japan", "J10", "026030000", "XJJ10026030000");
        SwitchCompositeInterface switch5 = new MarikoLite_v2("Lite (v2)", "Japan", "J90", "084050000", "XJJ90084050000");
        SwitchCompositeInterface switch6 = new Erista_v1("Erista (v1)", "Japan", "J70", "043700000", "XAJ70043700000");
        SwitchCompositeInterface switch7 = new Erista_v1("Erista (v1)", "Japan", "J40", "060800000", "XAJ40060800000");
        SwitchCompositeInterface switch8 = new Erista_v1("Erista (v1)", "West", "W90", "037700000", "XAW90037700000");
        SwitchCompositeInterface switchCom1 = new SwitchComposite();

        switchCom1.add(switch1);
        switchCom1.add(switch2);
        switchCom1.add(switch3);
        switchCom1.add(switch4);
        switchCom1.add(switch5);
        switchCom1.add(switch6);
        switchCom1.add(switch7);
        switchCom1.add(switch8);
        switchCom1.print();
    }
}
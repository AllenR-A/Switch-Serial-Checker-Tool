package com.switchcheck.SerialPatchFactory;

public class PatchedMarikoLite_v2 implements SwitchF {
    public String inform(){
        return """
                
                Lite (v2) - Hardware Patched.
                =========================================================================================================
                You're a bit unlucky, You have a "Hardware Patched" unit (NOT vulnerable to the Fusée Gelée exploit)
                =========================================================================================================
                You won't be able to jailbreak it unless:
                          + You're using one of those controversial "SX Lite" chips also called "gateway chips"
                            which you need to solder to tiny points inside the switch. It's hard, so unless you're
                            really confident on your soldering skills, read & watch guides on GBAtemp/YouTube or you
                            might end up like others who broke their switches...
                            (also, these chips are controversial as they come from a controversial company Xecuter,
                            where some -2- people have recently been arrested, one being the CEO named "Bowser" it seems)
                =========================================================================================================
                You can run the usual CFW, homebrew, etc. But installing & running Android/Linux DOESN'T WORK YET.
                You can run homebrew EXCEPT "RCM"-related homebrew, running these will brick your switch!
                (google the rest as it's too long to include and I might get spied-on by Nintendo ninjas)
                Here's a cool scenario:
                    + Use Custom Themes on the Switch.
                    + Playing PS4/PS5 games on Switch (turn on PS4/PS5 + use chiaki homebrew to stream to the Switch).
                    + Other extra stuff you can do with homebrew...
                =========================================================================================================""";
    }
}

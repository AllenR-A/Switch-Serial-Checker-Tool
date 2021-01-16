package com.switchcheck.SerialPatchFactory;

public class PatchedErista_v1 implements SwitchF {
    public String inform(){
        return """
                
                Erista (v1) - Patched.
                =========================================================================================================
                You're a bit unlucky, You have a "Patched" unit (NOT vulnerable to the Fusée Gelée exploit)
                =========================================================================================================
                You won't be able to jailbreak it unless:
                          + You're on firmware 4.1.0 & use Caffeine through PegaScape. (google it if you are on 4.1.0)
                          or
                          + You're using one of those controversial "SX Core" chips also called "gateway chips"
                            which you need to solder to tiny points inside the switch. It's hard, so unless you're
                            really confident on your soldering skills, read & watch guides on GBAtemp/YouTube or you
                            might end up like others who broke their switches...
                            (also, these chips are controversial as they come from a controversial company Xecuter,
                            where some -2- people have recently been arrested, one being the CEO named "Bowser" it seems)
                =========================================================================================================
                The upside is, if you managed to jailbreak this unit, you can still install & run Android/Linux, or the
                usual CFW, homebrew, emulators, etc. EXCEPT "RCM"-related homebrew, running these will brick your switch!
                (google the rest as it's too long to include and I might get spied-on by Nintendo ninjas)
                Here's some cool scenarios:
                    + Use Custom Themes on the Switch.
                    + Playing PC/Steam/Xbox games on Switch (Install Android + use "Steam Link" or "Xbox Game Pass").
                    + Playing PS4/PS5 games on Switch (turn on PS4/PS5 + use chiaki homebrew to stream to the Switch).
                    + Other extra stuff you can do with homebrew...
                =========================================================================================================""";

    }
}

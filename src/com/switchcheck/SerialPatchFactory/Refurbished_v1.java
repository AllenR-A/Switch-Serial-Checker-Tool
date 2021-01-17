package com.switchcheck.SerialPatchFactory;

/**
 * This is the "Might-be-patched-since-it's-refurbished" Erista (v1) object
 * @author Allen Royce Aleta
 */
public class Refurbished_v1 implements SwitchFactoryInterface {
    public String inform(){
        return """
                
                Erista (v1)(Refurbished) - Might be Patched...
                =========================================================================================================
                Your Model/Unit *might* be "Patched" (NOT vulnerable to the Fusée Gelée exploit)
                It's hard to check this unit using it's serial number. Go here: https://gbatemp.net/threads/512018/
                This is likely patched since it's Refurbished by Nintendo.
                =========================================================================================================
                If it turns-out to be a "Patched" model/unit, you won't be able to jailbreak it unless:
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

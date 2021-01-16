package com.switchcheck.SerialPatchFactory;

/**
 * This is the Unpatched Erista (v1) object
 */
public class UnpatchedErista_v1 implements SwitchFactoryInterface {
    /**
     * @return a text block of information
     */
    public String inform(){
        return """
                
                Erista (v1) - Unpatched!
                =========================================================================================================
                Yay! Your Model/Unit is "Unpatched"/"Hackable" (vulnerable to the Fusée Gelée exploit)
                Basically, you can jailbreak your switch and install and run Android/Linux, CFW, emulators, backups, etc.
                Here's some cool scenarios:
                    + Use Custom Themes on the Switch.
                    + Playing PC/Steam/Xbox games on Switch (Install Android + use "Steam Link" or "Xbox Game Pass").
                    + Playing PS4/PS5 games on Switch (turn on PS4/PS5 + use chiaki homebrew to stream to the Switch).
                    + Other extra stuff you can do with homebrew...
                =========================================================================================================
                You need: + PC/(OTG-enabled)Android/(jailbroken)iPhone/ or buy a "Dongle" (google "switch dongle hack")
                          + A male USB-C (for the switch) to male USB-A (PC/Phone)
                          + An "RCM jig" (google it) or a paperclip (bent in a specific way -google it-) to enter RCM
                          + Unfortunately, you're still gonna have to google the rest of the instructions
                            as it's too long to include. (and I might get spied-on by Nintendo ninjas)
                            There's this tho: https://switch.homebrew.guide/
                =========================================================================================================""";
    }
}

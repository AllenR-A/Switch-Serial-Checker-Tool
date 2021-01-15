package com.switchcheck.SerialPatchFactory;

/**
 * switchModel doesn't need to "ignore case" since
 * the Strings would be pre-defined already.
 */
public class SwitchFactory {
    public Switch getSwitch(String switchModel){
        if (switchModel.equals("Erista-Unpatched")){
            return new UnpatchedErista_v1();
        } else if (switchModel.equals("Erista-Maybe")){
            return new MightBePatchedErista_v1();
        } else if (switchModel.equals("Erista-Patched")){
            return new PatchedErista_v1();
        } else if (switchModel.equals("Mariko-Patched")){
            return new PatchedMariko_v2();
        } else if (switchModel.equals("MarikoLite-Patched")){
            return new PatchedMarikoLite_v2();
        }
        return new dummySwitch();
    }
}

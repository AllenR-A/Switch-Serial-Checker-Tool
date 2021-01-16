package com.switchcheck.SerialPatchFactory;

/**
 * switchModel doesn't need to "ignore case" since
 * the Strings would be pre-defined already.
 *
 * This Factory would generate objects
 * (the models & whether they're patched or not)
 */
public class SwitchFactory {
    public SwitchFactoryInterface getSwitch(String switchModel){
        return switch (switchModel) {
            case "Erista-Unpatched" -> new UnpatchedErista_v1();
            case "Erista-Maybe" -> new MightBePatchedErista_v1();
            case "EristaK-Maybe" -> new MightBePatchedEristaK_v1();
            case "Erista-Patched" -> new PatchedErista_v1();
            case "Refurbished-Maybe" -> new Refurbished_v1();
            case "Mariko-Patched" -> new PatchedMariko_v2();
            case "MarikoLite-Patched" -> new PatchedMarikoLite_v2();
            default -> new DummySwitch();
        };
    }
}

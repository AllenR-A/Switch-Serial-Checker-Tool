package com.switchcheck.SerialPatchFactory;

/**
 * a dummy object since java wants
 * SwitchFactory to return something at the last part
 * & I wanted to make sure "MarikoLite-Patched" returned the PatchedMarikoLite_v2() object
 * @author Allen Royce Aleta
 */
public class DummySwitch implements SwitchFactoryInterface {
    public String inform(){
        return "Dummy Switch Model, this is.";
    }
}

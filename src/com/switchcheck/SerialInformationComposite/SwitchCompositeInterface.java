package com.switchcheck.SerialInformationComposite;

/**
 * The interface in Composite Pattern Design.
 * Implemented by leaves (models) & SwitchComposite
 * @author Allen Royce Aleta
 */
public interface SwitchCompositeInterface {
    String getVersion();
    String getOrigin();
    String getAssemblyLine();
    String getNumber();
    String getSerialNumber();
    String getHackability();
    boolean getRefurbished();
    void add(SwitchCompositeInterface switchUnit);
    void remove(SwitchCompositeInterface switchUnit);
    void print();
    SwitchCompositeInterface getChild(int i);
}

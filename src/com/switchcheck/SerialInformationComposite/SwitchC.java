package com.switchcheck.SerialInformationComposite;

/**
 * The interface in Composite Design
 */
public interface SwitchC {
    String getVersion();
    String getOrigin();
    String getAssemblyLine();
    String getNumber();
    String getSerialNumber();
    String getHackability();
    boolean getRefurb();
    void add(SwitchC switchUnit);
    void remove(SwitchC switchUnit);
    void print();
    SwitchC getChild(int i);
}

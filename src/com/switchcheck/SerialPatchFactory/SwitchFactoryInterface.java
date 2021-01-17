package com.switchcheck.SerialPatchFactory;

/**
 * The interface in Factory Design.
 * Implemented by concrete classes (the objects to be generated)
 */
public interface SwitchFactoryInterface {
    /**
     * Informs the User about the unit's 'hackability'
     * @author Allen Royce Aleta
     * @return a text block of information
     */
    String inform();
}

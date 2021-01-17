package com.switchcheck.SerialModelState;

/**
 * The interface in State Design.
 * Implemented by concrete classes (the ones that set states)
 * @author Allen Royce Aleta
 */
public interface StateInterface {
    /**
     * Performs an action
     * @author Allen Royce Aleta
     * @param context SwitchContext object
     */
    void doAction(SwitchContext context);
}

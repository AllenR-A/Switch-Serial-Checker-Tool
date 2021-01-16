package com.switchcheck.SerialModelState;

/**
 * The interface in State Design.
 * Implemented by concrete classes (the ones that set states)
 */
public interface StateInterface {
    void doAction(SwitchContext context);
}

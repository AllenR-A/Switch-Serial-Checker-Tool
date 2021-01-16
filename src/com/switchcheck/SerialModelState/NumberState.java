package com.switchcheck.SerialModelState;

import com.switchcheck.SerialState;

/**
 * A concrete class implementing State interface
 * (sets Number state to the input)
 */
public class NumberState implements StateInterface {
    String string = SerialState.numberState;

    public void doAction(SwitchContext context){
        System.out.println("(Number state has been set)");
        context.setNumberState(this);
    }

    public String toString(){
        return string;
    }
}

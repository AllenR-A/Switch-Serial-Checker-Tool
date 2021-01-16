package com.switchcheck.SerialModelState;

import com.switchcheck.SerialState;

/**
 * A concrete class implementing State interface
 * (sets Serial Number state to the input)
 */
public class SerialNumberState implements StateInterface {
    String string = SerialState.serialState;

    public void doAction(SwitchContext context){
        System.out.println("(SerialNumber state has been set)");
        context.setSerialNumberState(this);
    }

    public String toString(){
        return string;
    }
}

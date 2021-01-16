package com.switchcheck.SerialModelState;

import com.switchcheck.SerialState;

public class SerialNumberState implements State{
    String string = SerialState.serialState;

    public void doAction(SwitchContext context){
        System.out.println("(SerialNumber state has been set)");
        context.setSerialNumberState(this);
    }

    public String toString(){
        return string;
    }
}

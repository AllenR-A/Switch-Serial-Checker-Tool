package com.switchcheck.SerialModelState;

import com.switchcheck.SerialState;

public class NumberState implements State {
    String string = SerialState.numberState;

    public void doAction(SwitchContext context){
        System.out.println("(Number state has been set)");
        context.setNumberState(this);
    }

    public String toString(){
        return string;
    }
}

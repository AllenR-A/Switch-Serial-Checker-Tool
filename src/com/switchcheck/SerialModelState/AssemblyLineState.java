package com.switchcheck.SerialModelState;

import com.switchcheck.SerialState;

public class AssemblyLineState implements State {
    String string = SerialState.assemblyState;

    public void doAction(SwitchContext context){
        System.out.println("(Assembly Line state has been set)");
        context.setAssemblyLineState(this);
    }

    public String toString(){
        return string;
    }
}

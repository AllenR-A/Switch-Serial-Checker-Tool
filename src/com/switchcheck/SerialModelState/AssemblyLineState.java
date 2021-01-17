package com.switchcheck.SerialModelState;

import com.switchcheck.SerialState;

/**
 * A concrete class implementing State interface
 * (sets Assembly Line state to SerialState.assemblyState string)
 * @author Allen Royce Aleta
 */
public class AssemblyLineState implements StateInterface {
    String string = SerialState.assemblyState;

    public void doAction(SwitchContext context){
        System.out.println("(Assembly Line state has been set)");
        context.setAssemblyLineState(this);
    }

    public String toString(){
        return string;
    }
}

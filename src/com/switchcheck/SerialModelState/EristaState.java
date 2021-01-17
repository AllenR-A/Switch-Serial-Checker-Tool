package com.switchcheck.SerialModelState;

/**
 * A concrete class implementing State interface
 * (sets Origin state to 'Erista')
 * @author Allen Royce Aleta
 */
public class EristaState implements StateInterface {
    public void doAction(SwitchContext context){
        System.out.println("Version set to Erista state");
        context.setVersionState(this);
    }

    public String toString(){
        return "Erista (v1)";
    }
}

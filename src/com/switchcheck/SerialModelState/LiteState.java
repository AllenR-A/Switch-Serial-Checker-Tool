package com.switchcheck.SerialModelState;

/**
 * A concrete class implementing State interface
 * (sets Version state to 'Lite')
 * @author Allen Royce Aleta
 */
public class LiteState implements StateInterface {
    public void doAction(SwitchContext context){
        System.out.println("(Version set to 'Lite' state)");
        context.setVersionState(this);
    }

    public String toString(){
        return "Lite (v2)";
    }
}

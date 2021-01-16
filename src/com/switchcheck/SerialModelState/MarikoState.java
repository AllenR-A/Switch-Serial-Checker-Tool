package com.switchcheck.SerialModelState;

/**
 * A concrete class implementing State interface
 * (sets Origin state to 'Mariko')
 */
public class MarikoState implements StateInterface {
    public void doAction(SwitchContext context){
        System.out.println("(Version set to 'Mariko' state)");
        context.setVersionState(this);
    }

    public String toString(){
        return "Mariko (v2)";
    }
}

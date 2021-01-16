package com.switchcheck.SerialModelState;

public class MarikoState implements State {
    public void doAction(SwitchContext context){
        System.out.println("(Version set to 'Mariko' state)");
        context.setVersionState(this);
    }

    public String toString(){
        return "Mariko (v2)";
    }
}

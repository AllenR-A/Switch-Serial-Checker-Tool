package com.switchcheck.SerialModelState;

public class LiteState implements State {
    public void doAction(SwitchContext context){
        System.out.println("(Version set to 'Lite' state)");
        context.setVersionState(this);
    }

    public String toString(){
        return "Lite (v2)";
    }
}

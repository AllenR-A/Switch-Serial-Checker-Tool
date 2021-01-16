package com.switchcheck.SerialModelState;

public class EristaState implements State {
    public void doAction(SwitchContext context){
        System.out.println("Version set to Erista state");
        context.setVersionState(this);
    }

    public String toString(){
        return "Erista (v1)";
    }
}

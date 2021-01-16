package com.switchcheck.SerialModelState;

public class WesternState implements State {
    public void doAction(SwitchContext context){
        System.out.println("(Origin set to 'Western' state)");
        context.setOriginState(this);
    }

    public String toString(){
        return "Western Countries";
    }
}

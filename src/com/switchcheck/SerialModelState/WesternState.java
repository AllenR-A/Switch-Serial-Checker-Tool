package com.switchcheck.SerialModelState;

/**
 * A concrete class implementing State interface
 * (sets Origin state to 'Western')
 */
public class WesternState implements StateInterface {
    public void doAction(SwitchContext context){
        System.out.println("(Origin set to 'Western' state)");
        context.setOriginState(this);
    }

    public String toString(){
        return "Western Countries";
    }
}

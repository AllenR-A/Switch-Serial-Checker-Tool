package com.switchcheck.SerialModelState;

/**
 * A concrete class implementing State interface
 * (sets Origin state to 'Korea')
 */
public class KoreanState implements StateInterface {
    public void doAction(SwitchContext context){
        System.out.println("(Origin set to 'Korea' state)");
        context.setOriginState(this);
    }

    public String toString(){
        return "Korea";
    }
}

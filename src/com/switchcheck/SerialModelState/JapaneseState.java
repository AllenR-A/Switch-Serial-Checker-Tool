package com.switchcheck.SerialModelState;

/**
 * A concrete class implementing State interface
 * (sets Origin state to 'Japan')
 * @author Allen Royce Aleta
 */
public class JapaneseState implements StateInterface {
    public void doAction(SwitchContext context){
        System.out.println("(Origin set to 'Japan' state)");
        context.setOriginState(this);
    }

    public String toString(){
        return "Japan";
    }
}

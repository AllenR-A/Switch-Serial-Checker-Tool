package com.switchcheck.SerialModelState;

/**
 * A concrete class implementing State interface
 * (sets Refurbished state to 'Yes')
 * @author Allen Royce Aleta
 */
public class YesState implements StateInterface {
    public void doAction(SwitchContext context){
        System.out.println("(Refurbished set to 'Yes' state)");
        context.setRefurbishedState(this);
    }

    public String toString(){
        return "Yes";
    }
}

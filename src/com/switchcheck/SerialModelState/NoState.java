package com.switchcheck.SerialModelState;

/**
 * A concrete class implementing State interface
 * (sets Refurbished state to 'No')
 */
public class NoState implements StateInterface {
    public void doAction(SwitchContext context){
        System.out.println("(Refurbished set to 'No' state)");
        context.setRefurbishedState(this);
    }

    public String toString(){
        return "No";
    }
}

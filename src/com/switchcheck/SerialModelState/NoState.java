package com.switchcheck.SerialModelState;

public class NoState implements State{
    public void doAction(SwitchContext context){
        System.out.println("(Refurbished set to 'No' state)");
        context.setRefurbishedState(this);
    }

    public String toString(){
        return "No";
    }
}

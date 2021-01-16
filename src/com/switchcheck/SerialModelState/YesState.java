package com.switchcheck.SerialModelState;

public class YesState implements State{
    public void doAction(SwitchContext context){
        System.out.println("(Refurbished set to 'Yes' state)");
        context.setRefurbishedState(this);
    }

    public String toString(){
        return "Yes";
    }
}

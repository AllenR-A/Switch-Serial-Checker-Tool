package com.switchcheck.SerialModelState;

public class JapaneseState implements State {
    public void doAction(SwitchContext context){
        System.out.println("(Origin set to 'Japan' state)");
        context.setOriginState(this);
    }

    public String toString(){
        return "Japan";
    }
}

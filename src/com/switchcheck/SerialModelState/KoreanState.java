package com.switchcheck.SerialModelState;

public class KoreanState implements State {
    public void doAction(SwitchContext context){
        System.out.println("(Origin set to 'Korea' state)");
        context.setOriginState(this);
    }

    public String toString(){
        return "Korea";
    }
}

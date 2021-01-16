package com.switchcheck;

import com.switchcheck.SerialModelState.*;
import org.junit.jupiter.api.Test;

class SerialStateTest {
    public static String serialState = "XJJ90084050000";

    @Test
    void switchSerialState() {
        SwitchContext context = new SwitchContext();

        JapaneseState japaneseState = new JapaneseState();
        WesternState westernState = new WesternState();
        KoreanState koreanState = new KoreanState();
        SerialNumberState serialNumberState = new SerialNumberState();
        AssemblyLineState assemblyLineState = new AssemblyLineState();
        NumberState numberState = new NumberState();
        YesState trueState = new YesState();
        NoState falseState = new NoState();

        numberState.doAction(context);
        if (serialState.charAt(1)=='A') {
            EristaState eristaState = new EristaState();
            eristaState.doAction(context);
            if (serialState.charAt(2)=='J') {
                if (serialState.charAt(3)=='9'){
                    trueState.doAction(context);
                } else {
                    falseState.doAction(context);
                }
                serialNumberState.doAction(context);
                assemblyLineState.doAction(context);
                japaneseState.doAction(context);
            } else if (serialState.charAt(2)=='W') {
                if (serialState.charAt(3)=='9'){
                    trueState.doAction(context);
                } else {
                    falseState.doAction(context);
                }
                serialNumberState.doAction(context);
                assemblyLineState.doAction(context);
                westernState.doAction(context);
            } else if (serialState.charAt(2)=='K') {
                if (serialState.charAt(3)=='9'){
                    trueState.doAction(context);
                } else {
                    falseState.doAction(context);
                }
                serialNumberState.doAction(context);
                assemblyLineState.doAction(context);
                koreanState.doAction(context);
            }
        } else if (serialState.charAt(1)=='K') {
            MarikoState marikoState = new MarikoState();
            marikoState.doAction(context);
            if (serialState.charAt(2)=='J') {
                if (serialState.charAt(3)=='9'){
                    trueState.doAction(context);
                } else {
                    falseState.doAction(context);
                }
                serialNumberState.doAction(context);
                assemblyLineState.doAction(context);
                japaneseState.doAction(context);
            } else if (serialState.charAt(2)=='W') {
                if (serialState.charAt(3)=='9'){
                    trueState.doAction(context);
                } else {
                    falseState.doAction(context);
                }
                serialNumberState.doAction(context);
                assemblyLineState.doAction(context);
                westernState.doAction(context);
            } else if (serialState.charAt(2)=='K') {
                if (serialState.charAt(3)=='9'){
                    trueState.doAction(context);
                } else {
                    falseState.doAction(context);
                }
                serialNumberState.doAction(context);
                assemblyLineState.doAction(context);
                koreanState.doAction(context);
            }
        } else if (serialState.charAt(1)=='J') {
            LiteState liteState = new LiteState();
            liteState.doAction(context);
            if (serialState.charAt(2)=='J') {
                if (serialState.charAt(3)=='9'){
                    trueState.doAction(context);
                } else {
                    falseState.doAction(context);
                }
                serialNumberState.doAction(context);
                assemblyLineState.doAction(context);
                japaneseState.doAction(context);
            } else if (serialState.charAt(2)=='W') {
                if (serialState.charAt(3)=='9'){
                    trueState.doAction(context);
                } else {
                    falseState.doAction(context);
                }
                serialNumberState.doAction(context);
                assemblyLineState.doAction(context);
                westernState.doAction(context);
            } else if (serialState.charAt(2)=='K') {
                if (serialState.charAt(3)=='9'){
                    trueState.doAction(context);
                } else {
                    falseState.doAction(context);
                }
                serialNumberState.doAction(context);
                assemblyLineState.doAction(context);
                koreanState.doAction(context);
            }
        }

        System.out.println("""
                ==========================================
                Version:"""+" "+context.getVersionState()+"""
                                
                Origin:""" +" "+context.getOriginState()+"""
                
                Serial Number:"""+" "+context.getSerialNumberState()+"""
                
                Assembly Line & Number:"""+" "+context.getAssemblyLineState()+" no."+context.getNumberState()+"""
                
                Refurbished by Nintendo:"""+" "+context.getRefurbishedState()+"""
                
                ==========================================""");

    }
}
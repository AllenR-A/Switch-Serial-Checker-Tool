package com.switchcheck;

import com.switchcheck.SerialModelState.*;
/**
 * This tells the user other info about their system.
 * This uses State Design Pattern
 */
public class SerialState {
    public static String serialState;
    public static String assemblyState;
    public static String numberState;

    /**
     * SwitchSerialState() will act like main() in State Design Pattern
     * (this uses nested if...else, since, it has to)
     * @param serial Takes in a serial number of the format "XXX00000000000" | 3 Letters & 11 Numbers
     * @return This returns a String message
     */
    public static String SwitchSerialState(String serial) {
        serialState = serial;
        assemblyState = serial.substring(2,5);
        numberState = serial.substring(6);

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

        String STATE_MESSAGE = """
                
                ==========================================
                                YOUR UNIT
                ==========================================
                 Version: %s
                 Origin: %s
                 Serial Number: %s
                 Assembly Line & Number: %s no.%s
                 Refurbished by Nintendo: %s
                ==========================================
                ==========================================""";

        return String.format(STATE_MESSAGE, context.getVersionState(),context.getOriginState(),context.getSerialNumberState(),context.getAssemblyLineState(),context.getNumberState(),context.getRefurbishedState());
    }
}

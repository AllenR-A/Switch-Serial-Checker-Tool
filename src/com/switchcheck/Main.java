package com.switchcheck;

import java.util.Scanner;

/**
 * The main class.
 * Has attribute "input" & "serialin".
 */
public class Main {
    public static int input;
    public static String serialin;
    public static int serialLength;
    public static Scanner scan = new Scanner(System.in);

    /**
     * This is just for restarting for wrong inputs
     */
    public static void startPick(){
        Scanner scan = new Scanner(System.in);
        try{
            input = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong Input!(Input \"1\", \"2\", or \"3\")");
            System.out.print("Input:");
            startPick();
        }

        if (input == 1 || input == 2 || input == 3)
            pick(input);
        else {
            System.out.println("Wrong Input!(Input \"1\", \"2\", or \"3\")");
            System.out.print("Input:");
            startPick();
        }
    }

    /**
     * This picks between 3 options
     * each option uses a different design pattern
     * The (now a comment) return statement was just for testing
     * @param i This accepts [1, 2, then every other int]
     */
    public static void pick(int i) {
        if (i == 1) {
            System.out.println("You Picked: 1. Patched Switch Checker\n======================================\n");
            System.out.println(SerialFactory.SwitchSerialFactory(serialInput()));
            //return "Picked Factory Pattern";
        } else if (i == 2) {
            System.out.println("You Picked: 2. Other Switch Information\n======================================\n");
            System.out.println(SerialState.SwitchSerialState(serialInput()));
            //return "Picked State Pattern";
        } else if (i == 3) {
            System.out.println("You Picked: 3. All of the above\n======================================\n");
            System.out.println(SerialComposite.SwitchSerialComposite(serialInput()));
            //return "Picked Composite Pattern";
        }
    }

    /**
     * Asks the user for the Switch Unit's Serial Number
     * this also has attribute "numbers" in the code.
     * @return returns the serial number
     */
    public static String serialInput() {
        System.out.println("""
                ==============================================================
                ==============================================================
                Find your Switch's serial number at the bottom of the device
                Or in "System Settings" -> "System" -> "Serial Information"
                ==============================================================
                 Format should be:   "XXX00000000000"
                   3 Letters followed by 11 numbers
                    "X" = letters | "0" = numbers
                ==============================================================
                For example, it should look like: "XAW10045230300" """);
        System.out.print("Input Serial Number: ");
        serialin = scan.nextLine();
        serialLength = serialin.length();
        try{
            long numbers = Long.parseLong(serialin.substring(3)); //this is here to triggered an exception if someone types a letter where the numbers are (after the 3 letters)
            if (serialLength==14) {
                if (serialin.charAt(3)=='1'||serialin.charAt(3)=='4'||serialin.charAt(3)=='7'||serialin.charAt(3)=='9'){
                    System.out.println("Your serial number: "+serialin+"\n==============================================================\n==============================================================\n");
                    return serialin;
                } else {
                    System.out.println("""
                            ==============================================================
                            ==============================================================
                                                Wrong serial number.
                               So far, no unit has the first number (this here: XXX0<-)
                                to be any number other than 1,4,7, or 9, so try again.""");
                    serialInput();
                }
            } else {
                System.out.print("Wrong serial number: "+serialin+"\n");
                System.out.println("WRONG INPUT, that's not what it looks like. Follow the format.");
                serialInput();
            }
        } catch (Exception e) {
            System.out.println(serialin+"\n");
            System.out.println("Wrong input, that's not what it looks like. Follow the format.");
            serialInput();
        }
        return "*this* string shouldn't appear";
    }

    /**
     * This is the Main Method.
     * This shows the user 3 options, then calls startPick() to start asking the user to choose.
     * @param args (the usual)
     */
    public static void main(String[] args) {
        System.out.println("""
                ======================================
                 = = =Switch Serial Checker Tool= = =
                ======================================
                ======================================
                         Pick one from the 3:        
                ======================================
                1.Patched Switch Checker
                2. Other Switch Information
                3. All of the above
                (Input "1", "2", or "3")
                ======================================""");

        System.out.print("Input: ");
        startPick();

    }

}

package com.switchcheck;

import java.util.Scanner;

/**
 * The main class.
 * Has attribute ["input"].
 */
public class Main {
    public static int input;

    /**
     * This is just for restarting for wrong inputs
     */
    public static void startPick(){
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();

        if (input == 1 || input == 2 || input == 3)
            pick(input);
        else {
            System.out.println("Wrong Input!");
            System.out.print("Input:");
            startPick();
        }
    }

    /**
     * This picks between 3 options
     * each option uses a different design pattern
     *
     * @param i This accepts [1, 2, then every other int]
     * @return This return statement is just for testing
     */
    public static String pick(int i) {
        if (i == 1) {
            System.out.println("You Picked: 1. Patched Switch Checker\n");
            System.out.println(SerialFactory.SwitchSerialFactory(serialInput()));
            return "Picked Factory Pattern";
        } else if (i == 2) {
            System.out.println("You Picked: 2. Other Switch Information\n");
            SerialModelState serialModel = new SerialModelState(serialInput());
            return "Picked State Pattern";
        } else {
            System.out.println("You Picked: 3. All of the above\n");
            SerialComposite serialAll = new SerialComposite(serialInput());
            return "Picked Composite Pattern";
        }
    }

    /**
     * Asks the user for the Switch Unit's Serial Number
     *
     * @return returns the serial number
     */
    public static String serialInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Find your system's serial number at the bottom of the device");
        System.out.println("Or in \"System Settings\" -> \"System\" -> \"Serial Information\"\n");
        System.out.print("Format should be:");
        System.out.println("\"XXX00000000000\"");
        System.out.println("3 Letters followed by 11 numbers");
        System.out.println("\"X\" means letters");
        System.out.println("\"0\" means numbers\n");
        System.out.println("Should look like: \"XAW10045230300\"\n");
        System.out.print("Input Serial Number: ");
        String serialin = scan.nextLine();
        if (serialin.length() == 14) {
            System.out.println("Your serial number: "+serialin);
            return serialin;
        } else {
            System.out.println(serialin+"\n");
            System.out.println("Wrong input, that's not what it looks like. Follow the format.\n");
            serialInput();
        }
        return "*this* string shouldn't appear";
    }

    /**
     * This is the Main Method.
     * This shows the user 3 options, then calls startpick() to start asking the user to choose.
     * @param args (the usual)
     */
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("= = =Switch Serial Checker Tool= = =");
        System.out.println("====================================");
        System.out.println("====================================");
        System.out.println("        Pick one from the 3:        ");
        System.out.println("====================================");
        System.out.println("1. Checker if Patched or Unpatched");
        System.out.println("2. Other Switch Information");
        System.out.println("3. All of the above");
        System.out.println("(Input \"1\", \"2\", or \"3\")\n");

        System.out.print("Input: ");
        startPick();
    }

}

package com.switchcheck;

import java.util.Scanner;

public class Main {
    public static int input;

    /**
     * This is just for restarting inputs
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
     * @param i This accepts 1, 2,then every other int
     * @return This return statement is for testing
     */
    public static String pick(int i) {
        if (i == 1) {
            System.out.println("You Picked:");
            System.out.println("1. Patched Switch Checker");
            System.out.println(SerialFactory.SwitchSerialFactory(serialInput()));
            return "Picked Factory Pattern";
        } else if (i == 2) {
            System.out.println("You Picked:");
            System.out.println("2. Other Switch Information");
            SerialModelState serialModel = new SerialModelState(serialInput());
            return "Picked State Pattern";
        } else {
            System.out.println("3. All of the above");
            SerialComposite serialAll = new SerialComposite(serialInput());
            return "Picked Composite Pattern";
        }
    }

    public static String serialInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Find your system's serial number at the bottom of the device");
        System.out.println("Or in \"System Settings\" -> \"System\" -> \"Serial Information\"");
        System.out.println("Format should be:");
        System.out.println("\"XXX00000000000\"");
        System.out.println("3 Letters followed by 11 numbers");
        System.out.println("\"X\" means letters");
        System.out.println("\"0\" means numbers\n");
        System.out.print("Input Serial Number: ");
        String serialin = scan.nextLine();
        if (serialin.length() == 14) {
            System.out.println("Your serial number: "+serialin);
            return serialin;
        } else {
            System.out.println(serialin);
            System.out.println("Wrong input, format should be:");
            System.out.println("\"XXX00000000000\"");
            System.out.println("3 Letters followed by 11 numbers");
            System.out.println("\"X\" means letters");
            System.out.println("\"0\" means numbers\n");
            serialInput();
        }
        return "*this* string shouldn't appear";
    }

    /**
     * This is the Main Method
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

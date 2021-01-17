package com.switchcheck.SerialInformationComposite;

import com.switchcheck.EristaPatchCheck;

/**
 * A Leaf Node in Composite Pattern Design
 * where each leaf is a type of Switch.
 * (has 5 attributes set with a constructor)
 * @author Allen Royce Aleta
 */
public class Erista_v1 implements SwitchCompositeInterface {
    String version;
    String origin;
    String assemblyLine;
    String number;
    String serialNumber;

    public Erista_v1(String version, String origin, String assemblyLine, String number, String serialNumber) {
        this.version = version;
        this.origin = origin;
        this.assemblyLine = assemblyLine;
        this.number = number;
        this.serialNumber = serialNumber;
    }

    @Override   //Nothing here since this is a leaf node
    public void add(SwitchCompositeInterface switchUnit){
    }

    @Override   //Nothing here since this is a leaf node
    public void remove(SwitchCompositeInterface switchUnit){
    }

    @Override   //Null since this is a leaf node
    public SwitchCompositeInterface getChild(int i){
        return null;
    }

    @Override   //Returns the Version
    public String getVersion(){
        return version;
    }

    @Override   //Returns the Origin
    public String getOrigin(){
        return origin;
    }

    @Override   //Returns the Assembly Line
    public String getAssemblyLine(){
        return assemblyLine;
    }

    @Override   //Returns the Number
    public String getNumber(){
        return number;
    }

    @Override   //Returns the Serial Number
    public String getSerialNumber(){
        return serialNumber;
    }

    /**
     * This version of getHackability() first calls EristaPatchCheck's patchCheck() method
     * to check the assembly line & number & see if it's unpatched, maybe patched, patched, or see if it's the unknown korea version.
     * @author Allen Royce Aleta
     * @return a message (which changes depending on whether it's patched or not)
     */
    @Override
    public String getHackability(){
        if (EristaPatchCheck.patchCheck(getAssemblyLine(),getNumber()).equals("Unpatched"))
            return """
                    Yay! It's Unpatched! (softmoddable)
                                 (have to google the rest unfortunately)
                                 I recommend checking out GBAtemp for help.""";
        else if (EristaPatchCheck.patchCheck(getAssemblyLine(),getNumber()).equals("Maybe"))
            return """
                    It might be Patched. (check here:
                                 https://gbatemp.net/threads/512018/)""";
        else if (EristaPatchCheck.patchCheck(getAssemblyLine(),getNumber()).equals("Refurbished"))
            return """
                    It might be Patched since 
                                 Nintendo refurbished it. (check here:
                                 https://gbatemp.net/threads/512018/)""";

        else if (EristaPatchCheck.patchCheck(getAssemblyLine(),getNumber()).equals("Patched"))
            return """
                    Patched. Hardmod only.
                                 (use controversial 'sx core' for now but
                                 you have to google the rest unfortunately)
                                 I recommend checking out GBAtemp for help.""";
        else if (EristaPatchCheck.patchCheck(getAssemblyLine(),getNumber()).equals("Korean"))
            return """
                    This model might be patched but who knows
                                 check here: gbatemp.net/threads/512018/
                                 It's unknown since not that well-documented
                                 and it's only sold in Korea.""";
        return "if *this* appears, something went wrong with Erista's getHackability()";
    }

    /**
     * Outputs true if assembly line is 9, like: "X9X"
     * @return true or false
     */
    @Override
    public boolean getRefurbished(){
        return assemblyLine.charAt(1) == '9';
    }

    @Override   //Message to be printed
    public void print(){
        System.out.println("=========================================================");
        System.out.println("Version: "+getVersion());
        System.out.println("Origin: "+getOrigin());
        System.out.println("Serial Number: "+getSerialNumber());
        System.out.println("Assembly Line & Number: "+getAssemblyLine()+" no."+getNumber());
        System.out.println("Refurbished by Nintendo: "+ getRefurbished());
        System.out.println("Hackability: "+getHackability());
        System.out.println("=========================================================");
    }
}

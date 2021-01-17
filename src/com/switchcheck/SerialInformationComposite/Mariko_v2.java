package com.switchcheck.SerialInformationComposite;

/**
 * A Leaf Node in Composite Pattern Design
 * where each leaf is a type of Switch.
 * (has 5 attributes set with a constructor)
 * @author Allen Royce Aleta
 */
public class Mariko_v2 implements SwitchCompositeInterface {
    String version;
    String origin;
    String assemblyLine;
    String number;
    String serialNumber;

    public Mariko_v2(String version, String origin, String assemblyLine, String number, String serialNumber) {
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

    @Override   //Returns Null since this is a leaf node
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

    @Override   //Returns Hackability (Patched)
    public String getHackability(){
        return """
                Patched. Hardmod only.
                             (use controversial 'sx core' for now but
                             you have to google the rest unfortunately)
                             I recommend checking out GBAtemp for help.""";
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

package com.switchcheck.SerialInfoComposite;

public class MarikoLite_v2 implements SwitchC {
    String version;
    String origin;
    String assemblyLine;
    String number;
    String serialNumber;

    public MarikoLite_v2(String version, String origin, String assemblyLine, String number, String serialNumber) {
        this.version = version;
        this.origin = origin;
        this.assemblyLine = assemblyLine;
        this.number = number;
        this.serialNumber = serialNumber;
    }

    @Override
    public void add(SwitchC switchUnit){
        //Nothing here since this is a leaf node
    }

    @Override
    public void remove(SwitchC switchUnit){
        //Nothing here since this is a leaf node
    }

    @Override
    public SwitchC getChild(int i){
        return null;   //Null since this is a leaf node
    }

    @Override
    public String getVersion(){
        return version;
    }

    @Override
    public String getOrigin(){
        return origin;
    }

    @Override
    public String getAssemblyLine(){
        return assemblyLine;
    }

    @Override
    public String getNumber(){
        return number;
    }

    @Override
    public String getSerialNumber(){
        return serialNumber;
    }

    @Override
    public String getHackability(){
        return """
                Patched. Hardmod only.
                \t\t\t (use controversial 'SX Lite' for now but
                \t\t\t you have to google the rest unfortunately)
                \t\t\t I recommend checking out GBAtemp for help.""";
    }

    /**
     * Outputs true if assembly line is 9, like: "X9X"
     * @return true or false
     */
    @Override
    public boolean getRefurb(){
        if (assemblyLine.charAt(1)=='9')
            return true;
        else
            return false;
    }

    @Override
    public void print(){
        System.out.println("=========================================================");
        System.out.println("Version: "+getVersion());
        System.out.println("Origin: "+getOrigin());
        System.out.println("Serial Number: "+getSerialNumber());
        System.out.println("Assembly Line & Number: "+getAssemblyLine()+" no."+getNumber());
        System.out.println("Refurbished by Nintendo: "+getRefurb());
        System.out.println("Hackability: "+getHackability());
        System.out.println("=========================================================");
    }
}

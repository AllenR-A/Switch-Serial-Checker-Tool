package com.switchcheck.SerialInformationComposite;

import java.util.ArrayList;
import java.util.List;

/**
 * The Composite in Composite Pattern Design
 * (the one adding, removing leaves)
 */
public class SwitchComposite implements SwitchCompositeInterface {

    List<SwitchCompositeInterface> switchUnits = new ArrayList<>();

    /**
     * Add a switchUnit to the switchUnits List
     * @param switchUnit The switch unit | e.g. erista, mariko, etc.
     */
    @Override
    public void add(SwitchCompositeInterface switchUnit){
        switchUnits.add(switchUnit);
    }

    /**
     * Remove a switchUnit to the switchUnits List
     * @param switchUnit The switch unit | e.g. erista, mariko, etc.
     */
    @Override
    public void remove(SwitchCompositeInterface switchUnit){
        switchUnits.remove(switchUnit);
    }

    /**
     * Retrieves a switchUnit from the switchUnits List
     * @param i The index of a switchUnit in the list
     */
    @Override
    public SwitchCompositeInterface getChild(int i){
        return switchUnits.get(i);
    }

    @Override   //Nothing since this class isn't supposed to return this.
    public String getVersion(){
        return "";
    }

    @Override   //Nothing since this class isn't supposed to return this.
    public String getOrigin(){
        return "";
    }

    @Override   //Nothing since this class isn't supposed to return this.
    public String getAssemblyLine(){
        return "";
    }

    @Override   //Nothing since this class isn't supposed to return this.
    public String getNumber(){
        return "";
    }

    @Override   //Nothing since this class isn't supposed to return this.
    public String getSerialNumber(){
        return "";
    }

    @Override   //Nothing since this class isn't supposed to return this.
    public String getHackability(){
        return "";
    }

    @Override   //Not really applicable since this class isn't supposed to return this.
    public boolean getRefurbished(){
       return false;
    }

    @Override   //Prints a message + the unit in the switchUnits List
    public void print(){
        System.out.println("Your Unit");
        System.out.println("=========================================================");

        for (SwitchCompositeInterface switchUnit : switchUnits) {
            switchUnit.print();
        }
    }
}

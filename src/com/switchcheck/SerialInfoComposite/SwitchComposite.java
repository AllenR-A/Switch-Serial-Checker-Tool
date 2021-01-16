package com.switchcheck.SerialInfoComposite;

import java.util.ArrayList;
import java.util.List;

public class SwitchComposite implements SwitchC{

    List<SwitchC> switchUnits = new ArrayList<>();

    /**
     * Add a switchUnit to the switchUnits List
     * @param switchUnit The switch unit | e.g. erista, mariko, etc.
     */
    @Override
    public void add(SwitchC switchUnit){
        switchUnits.add(switchUnit);
    }

    /**
     * Remove a switchUnit to the switchUnits List
     * @param switchUnit The switch unit | e.g. erista, mariko, etc.
     */
    @Override
    public void remove(SwitchC switchUnit){
        switchUnits.remove(switchUnit);
    }

    /**
     * Retrieves a switchUnit from the switchUnits List
     * @param i The index of a switchUnit in the list
     */
    @Override
    public SwitchC getChild(int i){
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
    public boolean getRefurb(){
       return false;
    }

    @Override
    public void print(){
        System.out.println("Your Unit");
        System.out.println("=========================================================");

        for (SwitchC switchUnit : switchUnits) {
            switchUnit.print();
        }
    }
}

package com.switchcheck.SerialModelState;

/**
 * The 'Context' in State Pattern Design
 * which uses the State interface to set/get private attributes. (encapsulation)
 * it's 6 attributes, which is then printed by the SerialState class
 * @author Allen Royce Aleta
 */
public class SwitchContext {
    private StateInterface version;
    private StateInterface origin;
    private StateInterface serialNumber;
    private StateInterface assemblyLine;
    private StateInterface number;
    private StateInterface refurbished;

    public SwitchContext(){
        version = null;
        origin = null;
        serialNumber = null;
        assemblyLine = null;
        number = null;
        refurbished = null;
    }

    public void setVersionState(StateInterface version) {
        this.version = version;
    }

    public StateInterface getVersionState() {
        return version;
    }

    public void setOriginState(StateInterface origin) {
        this.origin = origin;
    }

    public StateInterface getOriginState() {
        return origin;
    }

    public void setSerialNumberState(StateInterface serialNumber) {
        this.serialNumber = serialNumber;
    }

    public StateInterface getSerialNumberState() {
        return serialNumber;
    }

    public void setAssemblyLineState(StateInterface assemblyLine) {
        this.assemblyLine = assemblyLine;
    }

    public StateInterface getAssemblyLineState() {
        return assemblyLine;
    }

    public void setNumberState(StateInterface number) {
        this.number = number;
    }

    public StateInterface getNumberState() {
        return number;
    }

    public void setRefurbishedState(StateInterface refurbished) {
        this.refurbished = refurbished;
    }

    public StateInterface getRefurbishedState() {
        return refurbished;
    }
}

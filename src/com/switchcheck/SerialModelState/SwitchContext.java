package com.switchcheck.SerialModelState;

public class SwitchContext {
    private State version;
    private State origin;
    private State serialNumber;
    private State assemblyLine;
    private State number;
    private State refurbished;

    public SwitchContext(){
        version = null;
        origin = null;
        serialNumber = null;
        assemblyLine = null;
        number = null;
        refurbished = null;
    }

    public void setVersionState(State version) {
        this.version = version;
    }

    public State getVersionState() {
        return version;
    }

    public void setOriginState(State origin) {
        this.origin = origin;
    }

    public State getOriginState() {
        return origin;
    }

    public void setSerialNumberState(State serialNumber) {
        this.serialNumber = serialNumber;
    }

    public State getSerialNumberState() {
        return serialNumber;
    }

    public void setAssemblyLineState(State assemblyLine) {
        this.assemblyLine = assemblyLine;
    }

    public State getAssemblyLineState() {
        return assemblyLine;
    }

    public void setNumberState(State number) {
        this.number = number;
    }

    public State getNumberState() {
        return number;
    }

    public void setRefurbishedState(State refurbished) {
        this.refurbished = refurbished;
    }

    public State getRefurbishedState() {
        return refurbished;
    }
}

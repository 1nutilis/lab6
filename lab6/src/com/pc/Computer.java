package com.pc;

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private String OS;

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public String toString() {
        return "Компьютер: CPU - " + CPU + ", RAM - " + RAM + ", Storage - " + storage +
                ", GPU - " + GPU + ", ОС - " + OS;
    }
}

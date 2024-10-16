package com.pc;


public class OfficeComputerBuilder implements IComputerBuilder {
    private final Computer computer = new Computer();

    @Override
    public void setCPU() {
        computer.setCPU("Intel i3");
    }

    @Override
    public void setRAM() {
        computer.setRAM("8GB");
    }

    @Override
    public void setStorage() {
        computer.setStorage("1TB HDD");
    }

    @Override
    public void setGPU() {
        computer.setGPU("Integrated");
    }

    @Override
    public void setOS() {
        computer.setOS("Windows 10");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}


package com.pc;

public class ComputerDirector {
    private final IComputerBuilder builder;

    public ComputerDirector(IComputerBuilder builder) {
        this.builder = builder;
    }
    public void constructComputer() {
        builder.setCPU();
        builder.setRAM();
        builder.setStorage();
        builder.setGPU();
        builder.setOS();
    }

    public Computer getComputer() {
        return builder.getComputer();
    }
}
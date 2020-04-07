package com.company.factories.computers;

public abstract class Computer {
    public abstract String getCpu();
    public abstract String getRam();
    public abstract String getHdd();

    public String toString(){
        return "The cpu is: " + this.getCpu() + ", ram: " + this.getRam() + ", hdd: " + this.getHdd() + ".";
    }
}

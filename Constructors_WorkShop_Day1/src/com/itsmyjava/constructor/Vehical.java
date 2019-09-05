package com.itsmyjava.constructor;

public class Vehical {
    
    private int numberOfWheels;
     
    public Vehical(){
        System.out.println("This is vehical no-arg constructor");
    }
    public Vehical(int no){
        this.numberOfWheels = no;
        System.out.println("This is vehical parameter constructor");
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    
}

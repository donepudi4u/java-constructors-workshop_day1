package com.itsmyjava.constructor;

class SuperClass {
    int num = 100;
}

public class SuperAndThisDemo extends SuperClass {

    int num = 110;

    void printNumber() {
        // TODO print super class num value
        System.out.println("");

        // TODO print child class num value
        System.out.println("");
    }

    public static void main(String args[]) {
        SuperAndThisDemo obj = new SuperAndThisDemo();
        obj.printNumber();
    }
}

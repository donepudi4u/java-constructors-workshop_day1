package com.itsmyjava.constructor;

class Parentclass2 {
    // Overridden method
    void display() {
        System.out.println("Parent class method");
    }
}

public class SuperAndThisDemo3 extends Parentclass2 {

    // Overriding method
    void display() {
        System.out.println("Child class method");
    }

    void printMsg() {
        // TODO
        // call method from SuperAndThisDemo3
        // invoke method from  Parentclass2
    }

    public static void main(String args[]) {
        SuperAndThisDemo3 obj = new SuperAndThisDemo3();
        obj.printMsg();
    }
}

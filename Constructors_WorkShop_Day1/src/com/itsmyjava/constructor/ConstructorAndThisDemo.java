package com.itsmyjava.constructor;

public class ConstructorAndThisDemo {
    
    // TODO 
    // resolve/fix  the compilation issues below.
    // Estimate what would be the output
    private int varA ;
    private String varB;
    
    public ConstructorAndThisDemo(){
        System.out.println("This is no-arg constrcutor");
    }
    
    public ConstructorAndThisDemo(String b){
        System.out.println("This is parameter 1 constrcutor :"+ b);
    }
    
    public ConstructorAndThisDemo(int a){
        System.out.println("This is parameter 2 constrcutor :"+ a);
    }

    public ConstructorAndThisDemo(int a , String b){
        ConstructorAndThisDemo(a);
        ConstructorAndThisDemo(b);
        ConstructorAndThisDemo();
    }

}

package com.itsmyjava.constructor;

public class ConstructorAndReturnTypes {
    
    // TODO    
    /**
     * 1. Identify valid constructors.
     * 2. Identify Invalid constructors and write why they are invalid constructors.
     * 3. why compiler didn't error out for invalid constructor code.
     */
    private int age;
    private String name;
    
    
    public void ConstructorAndReturnTypes(){
        
    }
    public int ConstructorAndReturnTypes(String name , int age){
        return age;
    }
    
    public String  ConstructorAndReturnTypes(String name){
        return "Hello" + name;
    }
    
    public ConstructorAndReturnTypes(String name){
        this.name = name;
    }
    
    private void ConstructorAndReturnTypes(int a , int b){
        System.out.println(a+b);
    }
    
    public ConstructorAndReturnTypes(int age){
        this.age = age;
    }
    
    
    public ConstructorAndReturnTypes(String name,int age){
        this.name = name;
        this.age = age;
    }

}

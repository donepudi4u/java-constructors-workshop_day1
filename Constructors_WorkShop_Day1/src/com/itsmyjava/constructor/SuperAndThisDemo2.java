package com.itsmyjava.constructor;

class Parentclass
{
   Parentclass(String str){
    System.out.println("parameterized constructor of parent class");
   }
   
}


class SuperAndThisDemo2 extends Parentclass
{
    SuperAndThisDemo2(){
       
    super();  // TODO fix this error
    System.out.println("Constructor of child class");

   }
   void display(){
    System.out.println("Hello");
   }
   
   
   public static void main(String args[]){      
       SuperAndThisDemo2 obj= new SuperAndThisDemo2();
    obj.display();   
   }
}
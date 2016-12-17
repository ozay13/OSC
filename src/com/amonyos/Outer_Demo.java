/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amonyos;

/**
 *
 * @author ozaytunctan13
 */
public class Outer_Demo {
   // private variable of the outer class
   private int num = 175;  
   
   // inner class
   public class Inner_Demo {
       int data;
       public void setData(int data){
           this.data=data;
       }
      public int getNum() {
         System.out.println("This is the getnum method of the inner class");
         return num;
      }
     
   }
   public void setData(int d){
       new Inner_Demo().setData(d);
   }
    public int getData(){
          return new Inner_Demo().data;
      }
}

 class My_class2 {

   public static void main(String args[]) {
      // Instantiating the outer class
      Outer_Demo outer = new Outer_Demo();
       outer.setData(20);
       System.out.println(outer.getData());
      // Instantiating the inner class
      Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
      System.out.println(inner.data);
   }
}

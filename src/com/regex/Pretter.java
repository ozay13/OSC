/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regex;

import com.amonyos.Tsatic;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 *
 * @author ozaytunctan13
 */
public class Pretter {
    public static void main(String[] args) {
        Tsatic.setBakiye(20);
        System.out.println(Tsatic.maxBakiye);
        Pattern pat=Pattern.compile("[ \n , ; \t \\ . : = > < \" { } ( )]");
       String parcalar[]= pat.split("public class Salary extends Employee {\n" +
"   private double salary; // Annual salary\n" +
"   \n" +
"   public Salary(String name, String address, int number, double salary) {\n" +
"      super(name, address, number);\n" +
"      setSalary(salary);\n" +
"   }\n" +
"   \n" +
"   public void mailCheck() {\n" +
"      System.out.println(\"Within mailCheck of Salary class \");\n" +
"      System.out.println(\"Mailing check to \" + getName()\n" +
"      + \" with salary \" + salary);\n" +
"   }\n" +
"   \n" +
"   public double getSalary() {\n" +
"      return salary;\n" +
"   }\n" +
"   \n" +
"   public void setSalary(double newSalary) {\n" +
"      if(newSalary >= 0.0) {\n" +
"         salary = newSalary;\n" +
"      }\n" +
"   }\n" +
"   \n" +
"   public double computePay() {\n" +
"      System.out.println(\"Computing salary pay for \" + getName());\n" +
"      return salary/52;\n" +
"   }\n" +
"}");
        System.out.println(Arrays.toString(parcalar));
    }
}

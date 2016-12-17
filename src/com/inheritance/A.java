/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

/**
 *
 * @author ozaytunctan13
 */
public class A {

    private static int a = 5;

    public void setA(int a) {
        A.a = a;
    }

    public int getA() {
        return A.a;
    }

    public static void main(String[] args) {
        A a = new A();
        a.setA(20);
        a.setA(40);
        A a2 = new A();
        a2.setA(10);
        a2.setA(30);
        System.out.println(a.getA());
        System.out.println(a2.getA());
    }
}

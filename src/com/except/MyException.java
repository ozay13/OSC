/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.except;

/**
 *
 * @author ozaytunctan13
 */
public class MyException extends Exception{

    public MyException(String ex) {
        super(ex);
    } 
}
class testEx{
    public static void divide(int pay,int payda){
        try {
            if(payda==0){
                throw new MyException("Zero divide failed");
            }
            int kaln=pay/payda;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        divide(20, 0);
                
    }
}

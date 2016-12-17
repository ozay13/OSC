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
public class Tsatic {
    public static int maxBakiye=5_000;
    public static void setBakiye(int bakiye){
        Tsatic.maxBakiye=bakiye;
    }
    public static void main(String[] args) {
        Tsatic.setBakiye(500);
        Tsatic.setBakiye(600);
        System.out.println(Tsatic.maxBakiye);
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

import java.util.Arrays;

/**
 *
 * @author ozaytunctan13
 */
public class Array {

    public static Mat checkArray(int[] dizi) {
        Mat cm = new Mat();
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0) {
                cm.index.add(i);
                cm.value.add(dizi[i]);
                cm.sum += dizi[i];
            }
        }
        return cm;
    }
    public static void main(String[] args) {
        int a[]={1,2,8,3,10,2,6};
        Mat m=Array.checkArray(a);
        System.out.println(m.sum);
        System.out.println(Arrays.toString(m.value.subList(0,m.value.size()).toArray()));
        System.out.println(Arrays.toString(m.index.subList(0,m.index.size()).toArray()));
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wrk;

/**
 *
 * @author ozaytunctan13
 */
public class Array {

    private static int[] value;
    private static int len;

    public Array(int[] val) {
        this.value = val;
        this.len = value.length;
    }
    public  void doldur(int []c){
        if(c.length<len){
              int k=0;
            for (int i =len-c.length; i <len; i++) {
                value[i]=c[k++];
            }
        }
        else{
            value=c;
            len=c.length;
        }
    }

    public static void boyutInc(int n) {
        if (n > 0) {
            int y = len + n;
            int[] d = new int[y];
            for (int i = 0; i < len; i++) {
                d[i] = value[i];
            }
            value = d;
            len = y;
        }
    }
    public static void printArray(){
        System.out.printf("Array length:%d",Array.len);
        System.out.println(" ");
        for (int i = 0; i <len; i++) {
            System.out.println(value[i]);
        }
    }
    public static void main(String[] args) {
        int []val=new int[]{5,78,65,20,10,20};
        Array a=new Array(val);
        Array.printArray();
        int []c=new int[]{4,5,8};
        a.doldur(c);
        Array.printArray();
        int [][]f=new int [][]{{1,1,1},{0,0,0}};
    }
}

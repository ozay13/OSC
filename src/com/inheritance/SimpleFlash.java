/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/**
 *
 * @author ozaytunctan13
 */
public class SimpleFlash extends Flash {

    ArrayList<byte[]> ram = new ArrayList<>();
    int readCount=0;
    @Override
    public void write(byte[] bytes) {
        ram.add(bytes);
        iswriteState=true;
        isreadState=true;
    }

    @Override
    public byte[] read() {
        int k=0;
         if(iswriteState){
             ListIterator<byte[]>liste=ram.listIterator();
              if(ram.size()>readCount){
                  for (int i =0; i < readCount+1; i++) {
                      while (liste.hasNext()) {                          
                          k++;
                          if(readCount==k){
                              return liste.next();
                          }
                      }
                  }
              }
         }
         isreadState=false;
         return null;           
    }
public static void main(String []args){
    SimpleFlash flash=new SimpleFlash();
    flash.write(new byte[]{1,6,4,7,9});
    flash.write(new byte[]{1,6,4,0,1});
    flash.write(new byte[]{1,6,0,7,9});
    while(flash.isreadState){
        System.out.println(Arrays.toString(flash.read()));
    }

}
}


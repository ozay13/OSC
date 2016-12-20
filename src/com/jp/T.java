/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp;

import java.awt.TextArea;
import java.awt.TextField;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author ozaytunctan13
 */
public class T {

    public static void main(String[] args) {
//        String isim = JOptionPane.showInputDialog("Lutfen isminizi giriniz :");
//        JOptionPane.showMessageDialog(null, "Java Sinifina Hos Geldiniz! " + isim,
//                "Hosgeldiniz1SW programi", JOptionPane.INFORMATION_MESSAGE);
//        System.exit(0);
//        int a=20;
//        StringTokenizer tok=new StringTokenizer("assa ? ali can");
//        while (tok.hasMoreElements()) {            
//            System.out.println(tok.nextElement());
//        }
//        
         int []d=new int[]{1,4,8,9};
         Tval t=Tre.init(d);
         t.printElem();
         }

}
class Tval{
    public  List value=new ArrayList<Integer>();
    public  List indexses=new ArrayList<Integer>();
    public  void printElem(){
        for (int i = 0; i <value.size(); i++) {
            System.out.println(indexses.get(i)+"-> "+value.get(i));
        }
    }
}
class Tre{
    public static  Tval init(int []d){
        Tval t=new Tval();
        for (int i = 0; i <d.length; i++) {
            t.value.add(d[i]);
            t.indexses.add(i);
        }
        return t ;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regex2;

import java.nio.Buffer;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author ozaytunctan13
 */
public class StringTokenizerTest {

    public static void main(String arg[]) {
        String s = "Evvel zaman içinde kalbur saman içinde ben dedemin beşiğini tıngır mıngır sallar iken";
        System.out.println("sentence : " + s);
        StringTokenizer t = new StringTokenizer(s, " ");
        System.out.println("kelime sayısı : " + t.countTokens());
        int i = 0;
        while (t.hasMoreTokens()) {
            System.out.println("kelime indeksi : " + (i++) + " kelime : " + t.nextToken());
        }
        StringBuffer buf=new StringBuffer();
        buf.append("Ozay java");
        System.out.println(buf.reverse().toString());
        JOptionPane.showMessageDialog(null,"ozay tunctan Siirt Bilgisayar Mühendisliği mezunu 2017 tarihinde yuklisans ve doktora başlamıştır.","Eğitim Biligisi",JOptionPane.INFORMATION_MESSAGE);
        
    }
}

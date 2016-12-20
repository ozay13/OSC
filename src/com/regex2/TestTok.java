/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regex2;

import java.util.StringTokenizer;

/**
 *
 * @author ozaytunctan13
 */
public class TestTok {

    public static void main(String[] args) {
        String s = "ozay, veli ahmet , kaya, ;yavuz {\"ozay\",\"tunctan\"}"
                + " while (t.hasMoreTokens()) {\n"
                + "            System.out.println(t.nextToken());\n"
                + "     String[] token = {\" \", \",\"};\n"
                + "        StringTokenizer t=new StringTokenizer(s,\", ; { } ( ) \n .\" \");\n"
                + "        int i=0;\n"
                + "         while (t.hasMoreTokens()) {\n"
                + "            System.out.println(t.nextToken());\n"
                + "        }";
        String[] token = {" ", ","};
        StringTokenizer t = new StringTokenizer(s, ", ; { } ( ) \n . \" = [ ] ");
        int i = 0;
        while (t.hasMoreTokens()) {
            System.out.println(t.nextToken());
        }
    }
}

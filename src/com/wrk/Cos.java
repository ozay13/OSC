/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wrk;

import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ozaytunctan13
 */
public class Cos {

    public static void main(String[] args) {
        List list = new ArrayList<Double>();
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader("C:\\Users\\ozaytunctan13\\Documents\\NetBeansProjects\\WorkerApp\\src\\com\\wrk\\fr.txt")));
            while (sc.hasNext()) {
                if (sc.hasNextDouble()) {
                    list.add(sc.nextDouble());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Double d1[] = new Double[1];
        Double[] d = (Double[]) list.toArray(d1);
        System.out.println(Arrays.toString(d));
        

    }
}

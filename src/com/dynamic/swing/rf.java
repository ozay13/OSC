/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dynamic.swing;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author ozaytunctan13
 */
class sliderP1test {

    public static void main(String args[]) {
         JFrame fr = new JFrame("Game Avatar");
        fr.setSize(500, 500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new FlowLayout());
        fr.add(new sliderP1());
        fr.setVisible(true);
       
    }
}

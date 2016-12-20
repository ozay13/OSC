/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dynamic.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author ozaytunctan13
 */
public class sliderP1 extends JPanel implements ChangeListener {

    private dialP1 p;
    private JSlider cap;
    private JTextArea tf;
    Color r = Color.lightGray;
    public double x;
// pencereyi baslatma metodu

    public sliderP1() {
        x = 40.0;
        this.setLayout(new BorderLayout());
        p = new dialP1("isim", "derece K", 10.0, 50.0, 8, 5, 20, 300);
        p.setx(x);
        cap = new JSlider(SwingConstants.HORIZONTAL, 10, 50, (int) x);
        cap.setMajorTickSpacing(5);
        cap.setMinorTickSpacing(1);
        cap.setPaintTicks(true);
        cap.setPaintLabels(true);
        cap.addChangeListener((ChangeListener) this);
        tf = new JTextArea("" + x);
        add(tf, BorderLayout.NORTH);
        add(p, BorderLayout.CENTER);
        add(cap, BorderLayout.SOUTH);
    }
// girdi alanindaki olan olaylari dinleme metodu

    public void stateChanged(ChangeEvent e) {
        x = (double) cap.getValue();
        p.setx(x);
        tf.setText("" + x);
        repaint();
    }
//=====================================================
}

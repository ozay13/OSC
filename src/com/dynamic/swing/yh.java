/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dynamic.swing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ozaytunctan13
 */
public class yh extends JPanel implements MouseListener, MouseMotionListener {
//BAS-SÜRÜKLE-ÇEK ÇİZGİ AİLESİ

    int x1[], y1[], x2[], y2[];
    int n;
    Line2D l[];
    Color c;

    public yh() {
        super();
        x1 = new int[100];
        y1 = new int[100];
        l = new Line2D[100];
        x2 = new int[100];
        y2 = new int[100];
        n = 0;
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void setLine(int x1i, int y1i, int x2i, int y2i) {
        x1[n] = x1i;
        y1[n] = y1i;
        x2[n] = x2i;
        y2[n] = y2i;
        n++;
    }

    public void paint(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(new Font("Serif", Font.BOLD, 24));
        g2.setColor(Color.blue);
        g2.setStroke(new BasicStroke(2.0f));
        for (int i = 0; i < n; i++) {
            l[i] = new Line2D.Double(x1[i], y1[i], x2[i], y2[i]);
            g2.draw(l[i]);
        }
    }
//MouseListener (fare dinleyicisi)

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        x1[n] = e.getX();
        y1[n] = e.getY();
        System.out.println(x1[n] + " " + y1[n]);
    }

    public void mouseReleased(MouseEvent e) {
        x2[n] = e.getX();
        y2[n] = e.getY();
        n++;
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
      
    }

    @Override
    public void mouseDragged(MouseEvent e) {
         }

    @Override
    public void mouseMoved(MouseEvent e) {
           }

}

class fareF2 {

    public static void main(String args[]) {
        JFrame fr = new JFrame("Game Avatar");
        fr.setSize(500, 500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.add(new yh());
        fr.setVisible(true);
        
    }
}

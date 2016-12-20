/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dynamic.swing;

import com.sun.javafx.tk.Toolkit;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.net.URL;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ozaytunctan13
 */
public class GamePane extends JPanel {

    private Image resim;

    public GamePane(String s) {
        super();
        URL url = getClass().getResource(s);
        resim = getToolkit().getImage(url);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Dimension d = getSize();
        int dx = d.width;
        int dy = d.height;
        g2.drawImage(resim, 0, 0, dx, dy, this);
        g2.setColor(Color.red);
        g2.setFont(new java.awt.Font("arial", java.awt.Font.BOLD, 55));
        g2.drawString("GAME START", this.getWidth() / 2, this.getHeight() / 2);

        g2.setStroke(new BasicStroke(4.0f));
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        float dash3[] = {10.0f, 3.0f, 3.0f};
        BasicStroke d3 = new BasicStroke(3.0f, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_MITER,
                3.0f, dash3, 2.0f);
        g2.setStroke(d3);
        Ellipse2D x = new Ellipse2D.Double(50, 50, 500, 200);
        g2.draw(x);
    }

    public static void main(String[] args) {
        GamePane p = new GamePane("images.jpg");
        JFrame fr = new JFrame("Game Avatar");
        fr.setSize(500, 500);

        JButton b = new JButton("Color select");
        b.setSize(100,100);
        b.addActionListener(new ActionListener() {
            Color c = null;

            @Override
            public void actionPerformed(ActionEvent e) {

                c = JColorChooser.showDialog(null, "arka plan rengi ", c);
                fr.setBackground(c);
                fr.repaint();
            }
        });
        fr.add(b);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.add(p);
        fr.setVisible(true);
    }
}

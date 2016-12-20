/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dynamic.swing;

/**
 *
 * @author ozaytunctan13
 */
import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.net.*;
import java.io.*;
import java.awt.Graphics;
import java.util.*;
import java.text.*;
import java.util.Locale;
import java.awt.image.*;
// ============ //

public class dialP1 extends JPanel {

    double x, minx, maxx;
    double minteta, maxteta;
    int n;
    int n1;
    JPanel out;
    String name;
    String unit;
    JTextArea jta;
    Color col;
    int width;
    int height;

    public dialP1(String namei, String uniti, double minxi, double maxxi, int ni, int n1i, int widthi, int heighti) {// input parameters
// Name : name
// Unit : unit
// minx : minimum x
// maxx : maximum x
// n : big scale number
// n1 : small scale number
// width: width of the column
// height: height of the column
        out = new JPanel();
        out.setLayout(new BorderLayout());
        name = namei;
        unit = uniti;
        minx = minxi;
        maxx = maxxi;
        width = widthi;
        height = heighti;
        x = minx;
        n = ni;
        n1 = n1i;
        jta = new JTextArea("");
        jta.setFont(new Font("TimesRoman", Font.BOLD, 32));
        col = this.getBackground();
        jta.setBackground(col);
        out.add(jta, BorderLayout.SOUTH);
        add(out);
    }

    public void setColor(Color c) {
        col = c;
    }

    public void setx(double xi) {
        x = xi;
    }

    public static String toString(double left, int w, int d) // converts a double to a string with given width and decimals.
    {
        NumberFormat df = NumberFormat.getInstance(Locale.US);
        df.setMaximumFractionDigits(d);
        df.setMinimumFractionDigits(d);
        df.setGroupingUsed(false);
        String s = df.format(left);
        while (s.length() < w) {
            s = "" + s;
        }
        if (s.length() > w) {
            s = "";
            for (int i = 0; i < w; i++) {
                s = s + "-";
            }
        }
        return s;
    }

    public TexturePaint getImageTexture(String imageFile, int xi, int yi, int widthi, int heighti) {
        URL url = getClass().getResource(imageFile);
        Image img = getToolkit().getImage(url);
        try {
            MediaTracker tracker = new MediaTracker(this);
            tracker.addImage(img, 0);
            tracker.waitForID(0);
        } catch (Exception e) {
        }
//width = widthi;
//height = heighti;
        BufferedImage buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics g = buffImg.getGraphics();
        g.drawImage(img, -100, -100, this);
        Rectangle2D rect = new Rectangle((int) (xi - width), (int) (yi - height), width, height);
        return new TexturePaint(buffImg, rect);
    }

    public void drawYTic(Graphics2D g2, int xi, int yi) {
//draw a series of y axis tics
        int dtic = (int) (height / n);
        int dtic1 = (int) (height / n / n1);
        int x1 = xi;
        int y1 = yi;
        int R1 = height;
        int R2 = width;
        int dR = 5;
        int dR1 = 5;
        int dR2 = 20;
        double dx = (maxx - minx) / n;
        double xx1, xx2, yy1, yy2;
        double xx1a, xx2a, yy1a, yy2a;
        double xx = minx;
        xx1 = x1 + R2 + dR;
        yy1 = y1 + R1;
        xx2 = x1 + R2 + dR + dR2;
        yy2 = y1 + R1;
        xx1a = x1 + R2 + dR;
        xx2a = x1 + R2 + dR + dR1;
        for (int i = 0; i < n; i++) {
            g2.draw(new Line2D.Double(xx1, yy1, xx2, yy1));
            g2.drawString("" + xx, (int) xx2, (int) yy1);
            yy1a = yy1;
            yy2a = yy2;
            for (int j = 0; j < n1; j++) {
                g2.draw(new Line2D.Double(xx1a, yy1a, xx2a, yy1a));
                yy1a -= dtic1;
            }
            yy1 -= dtic;
            xx += dx;
        }
        g2.draw(new Line2D.Double(xx1, yy1, xx2, yy1));
        g2.drawString("" + xx, (int) xx2, (int) yy1);
    }

    public void paintComponent(Graphics g) {
        final Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        try {
            final BasicStroke s1 = new BasicStroke(1);
            final BasicStroke s2 = new BasicStroke(2);
            final BasicStroke s3 = new BasicStroke(3);
            final BasicStroke s4 = new BasicStroke(4);
            final BasicStroke s6 = new BasicStroke(6);
            final BasicStroke s10 = new BasicStroke(10);
            FontMetrics metrics = g.getFontMetrics();
//System.out.println(metrics.getAscent());
//System.out.println(metrics.getDescent());
//System.out.println(metrics.getHeight());
            int xi = 100;
            int yi = 100;
            int R1 = height;
            int R2 = width;
            int dh = 30;
            g2.setColor(Color.yellow);
            TexturePaint tp = getImageTexture("deneysan1.jpg", xi, yi, R1, R1);
            g2.setPaint(tp);
            g2.setColor(Color.blue);
            RoundRectangle2D rect = new RoundRectangle2D.Double((int) xi, (int) (yi - dh), R2, (R1 + 2 * dh), 20, 20);
            g2.setStroke(s4);
            g2.draw(rect);
            g2.setStroke(s1);
            g2.fill(rect);
            Ellipse2D el1 = new Ellipse2D.Double((int) (xi - R2 / 2), (int) (yi + R1 - R2 / 2 + dh), 2 * R2, 2 * R2);
            g2.setStroke(s6);
            g2.draw(el1);
            g2.setStroke(s1);
            g2.setColor(Color.red);
            g2.fill(el1);
            int xx = (int) ((x - minx) / (maxx - minx) * R1);
            RoundRectangle2D rect1 = new RoundRectangle2D.Double((int) xi, (int) (yi + (R1 - xx)), R2, (int) (xx + dh), 10, 10);
            g2.setStroke(s6);
            g2.fill(rect1);
            g2.setPaint(Color.black);
            g2.setStroke(s1);
            drawYTic(g2, xi, yi);
        } catch (NullPointerException e) {
        }
    }
}

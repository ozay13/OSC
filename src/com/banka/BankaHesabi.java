/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banka;

import javax.swing.JOptionPane;

/**
 *
 * @author ozaytunctan13
 */
public class BankaHesabi {

    private String bankahesapno;
    private String sifre;
    private int hak;

    public BankaHesabi(String an, String c) {
        bankahesapno = an;
        sifre = c;
        hak = 3;
    }

    public void loginAtm() {
        while (hak <= 3 && hak > 0) {
            hak--;
            String pass = JOptionPane.showInputDialog("şifreyi giriniz = ") + "";
            if (pass.equals(sifre)) {
                JOptionPane.showMessageDialog(null, "Hoş geldiniz sayın Müsterimiz:" + bankahesapno);
                return;
            }
            JOptionPane.showMessageDialog(null, String.format("Yanlış şifre girdiniz %d hakkınız kaldı.", hak));
        }
        JOptionPane.showMessageDialog(null, "Yanlış şifre giridiniz Lufen Bankaya Uğrayınız.");
    }

    public static void main(String[] args) {
        BankaHesabi b = new BankaHesabi("ASDFR1234Ozay", "ozay1234");
        b.loginAtm();
    }
}

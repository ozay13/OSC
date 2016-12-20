/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wrk;

/**
 *
 * @author ozaytunctan13
 */
public abstract class AbstractSinif {

    public int[] deger;

    public AbstractSinif(int[] deger) {
        this.deger = deger;
    }

    public abstract void plot(int[] val);

    public abstract void hist(int[] deger);

    public static void tCiz() {

    }

    public void ciz() {
        System.out.println("Cizmeye başladı.");
        for (int i = 0; i < deger.length; i++) {
            for (int j = 0; j < deger[i]; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}

class Grafik extends AbstractSinif {

    public Grafik(int[] value) {
        super(value);

    }

    @Override
    public void plot(int[] val) {
        this.deger = val;
        this.ciz();
    }

    @Override
    public void hist(int[] deger) {
        this.deger = deger;
        this.ciz();
    }

    public static void main(String[] args) {
        int[] value = new int[]{4, 1, 5, 8, 3, 9, 1, 4, 7};
        Grafik g = new Grafik(value);
        g.ciz();
        g.hist(new int[]{1, 2, 3, 4, 5, 6});
        g.plot(value);
        AbstractSinif.tCiz();
    }
}

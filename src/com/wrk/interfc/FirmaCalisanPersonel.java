/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wrk.interfc;

/**
 *
 * @author ozaytunctan13
 */
interface IsciState {

    public void execute(FirmaCalisanPersonel p);
}

public class FirmaCalisanPersonel implements IsciState {

    static int calisanSayisi;
    static int isciSayisi = 10;
    private  int perId = 100;

    @Override
    public void execute(FirmaCalisanPersonel per) {
        calisanSayisi++;
        perId++;
        System.out.printf("Calisan%d Çalışmaya Başladı.\n ", per.perId);

    }

    public void stop(FirmaCalisanPersonel per) {
        System.out.printf("%d Nolu Calisan çalışmayı bitirdi.\n ", per.perId);
        calisanSayisi--;

    }

    public int getCalisan() {
        return calisanSayisi;
    }

    public int getCalismayan() {
        return (isciSayisi - calisanSayisi);
    }

    public FirmaCalisanPersonel isiKimBirakti() {
        return new FirmaCalisanPersonel();
    }

    public static void main(String[] args) {
        FirmaCalisanPersonel m1 = new FirmaCalisanPersonel();
        m1.execute(m1);
        FirmaCalisanPersonel m2 = new FirmaCalisanPersonel();
        m2.execute(m2);
        FirmaCalisanPersonel m3 = new FirmaCalisanPersonel();
        m3.execute(m2);
        System.out.println("İşini yapan sayısı:" + m3.getCalisan());
        System.out.println("İşini yapmayan sayısı:" + m3.getCalismayan());
        m2.stop(m2);
        System.out.println("İşini yapan sayısı:" + m3.getCalisan());
        System.out.println("İşini yapmayan sayısı:" + m3.getCalismayan());
        m2.execute(m2);
        System.out.println("İşini yapan sayısı:" + m3.getCalisan());
        System.out.println("İşini yapmayan sayısı:" + m3.getCalismayan());
    }
}

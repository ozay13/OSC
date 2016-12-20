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
public interface Isci {

    public void execute();
}

class Personel {

    public Personel() {
    }

    Personel(Isci is) {
        is.execute();
    }

    public void run(Isci is) {
        is.execute();//execute metoduna çağrıda bulundu....
    }

    public static void main(String[] args) {

        Personel per = new Personel();
        per.run(new Isci() {
            @Override
            public void execute() {
                System.out.println("Işçi çalşmaya başladı");
            }
        });
    }
}

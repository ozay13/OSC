/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

import java.util.ArrayList;

/**
 *
 * @author ozaytunctan13
 */
public class Mat {
    public int sum;
    public ArrayList<Integer> index;
    public ArrayList<Integer> value;

    public Mat() {
        this.index = new ArrayList<>();
        this.value = new ArrayList<>();
        this.sum = 0;
    }
    public Mat(ArrayList<Integer> index, ArrayList<Integer> value, int sum) {
        this.index = index;
        this.value = value;
        this.sum = sum;
    }
}

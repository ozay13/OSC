/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author ozaytunctan13
 */
public class WorkString {

    public static double[] map(double[] array) {
        double[] temp = new double[array.length];
        temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);
        double max = temp[temp.length - 1];
        double min = temp[0];
        for (int i = 0; i < temp.length; i++) {
            array[i] = (array[i] - min) / (max - min);
        }
        return array;
    }

    public static double[] map(double[] array, double min, double max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] * (max - min)) + min;
        }
        return array;
    }

    public static int[] uniqueArray(int size, int min, int max) {
        int[] array = new int[size];
        int index = 0, value;
        if (max - min >= size) {
            for (int i = 0; i < size; i++) {
                do {
                    value = (int) (Math.random() * (max - min)) + min;
                    index = searchArray(array, 0, i, value);
                } while (index >= 0);
                array[i] = value;
            }
            return array;
        } else {
            return array;
        }
    }

    public static int searchArray(int[] array, int from, int to, int key) {
        if (from <= array.length - 1) {
            for (int i = from; i < to; i++) {
                if (array[i] == key) {
                    return i;
                }
            }
        } else {
            return -1 - from;
        }
        return -1 - from;
    }

    public static void main(String[] args) {
        int[] array = uniqueArray(10, 5, 20);
        System.out.println(Arrays.toString(array));
        Calendar c=Calendar.getInstance();
     
      
    
    }
}

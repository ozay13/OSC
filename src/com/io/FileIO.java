/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author ozaytunctan13
 */
public class FileIO {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedInputStream w = new BufferedInputStream(new FileInputStream(new File("C:\\Users\\ozaytunctan13\\Desktop\\JAVA NOT HAZIRLAMA\\matrix.txt")));
        while (w.available() > 0) {
            char s = (char) w.read();
            System.out.print(s);
        }
        InputStreamReader r=new InputStreamReader(new FileInputStream(new File("C:\\Users\\ozaytunctan13\\Desktop\\JAVA NOT HAZIRLAMA\\matrix.txt")));
             
    }
}

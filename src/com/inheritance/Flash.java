/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

/**
 *
 * @author ozaytunctan13
 */
public abstract class Flash {
    protected boolean isreadState=false;
    protected boolean iswriteState=false;
    public abstract void write(byte[]bytes);
    public abstract byte[] read();
}

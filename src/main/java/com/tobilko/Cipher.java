package com.tobilko;

/**
 *
 * Created by Andrew Tobilko on 11/15/2016.
 *
 */
public class Cipher {

    private int size;

    public Cipher(int s) { this.size = s; }

    protected int encode(int i, int k) { return ((i + k) % size) - ((i + k) < 0 || (i + k) > size ? size : 0); }
    protected int decode(int i, int k) { return ((i - k) % size) + ((i - k) < 0 || (i - k) > size ? size : 0); }

}
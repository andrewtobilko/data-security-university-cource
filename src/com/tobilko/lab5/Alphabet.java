package com.tobilko.lab5;

/**
 *
 * Created by Andrew Tobilko on 11/10/2016.
 *
 */
public enum Alphabet {
    ENG(25, 65),
    RUS(31, 1040);

    private final int SIZE;
    private final int FIRST_LETTER_SHIFT;

    Alphabet(int size, int shift) {
        SIZE = size;
        FIRST_LETTER_SHIFT = shift;
    }

    public int getFirstLetterShift() { return FIRST_LETTER_SHIFT; }
    public int getSize() { return SIZE; }

}

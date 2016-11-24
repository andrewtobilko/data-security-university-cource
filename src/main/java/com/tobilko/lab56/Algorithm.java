package com.tobilko.lab56;

import static java.lang.String.valueOf;
import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

/**
 *
 * Created by Andrew Tobilko on 11/17/2016.
 *
 */
public class Algorithm {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz!?@#$%^&*()-=' []{};:/.1234567890\n";
    private OffsetStrategy strategy;

    public Algorithm(OffsetStrategy strategy) {
        this.strategy = strategy;
    }

    public String execute(String in, boolean direction) {
        return range(0, in.length())
               .mapToObj(i -> execute(ALPHABET.indexOf(in.charAt(i)), direction, i))
               .map(i -> valueOf(ALPHABET.charAt(i)))
               .collect(joining());
    }

    private int execute(int i, boolean direction, int pos) {
        int i1 = i + (direction ? 1 : -1) * strategy.calculate(pos);
        while (i1 < 0) i1 += ALPHABET.length();
        return i1 % ALPHABET.length();
    }

}

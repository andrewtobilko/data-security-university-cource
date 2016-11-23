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

    private OffsetStrategy strategy;
    private final String alphabet = "abcdef";

    public Algorithm(OffsetStrategy strategy) {
        this.strategy = strategy;
    }

    public String execute(String in, boolean direction) {
        return range(0, in.length())
               .mapToObj(i -> execute(alphabet.indexOf(in.charAt(i)), direction, i))
               .map(i -> valueOf(alphabet.charAt(i)))
               .collect(joining());
    }

    private int execute(int i, boolean direction, int pos) {
        int i1 = i + (direction ? 1 : -1) * strategy.calculate(pos);
        while (i1 < 0) i1 += alphabet.length();
        return i1 % alphabet.length();
    }

}

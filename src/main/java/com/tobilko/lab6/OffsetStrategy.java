package com.tobilko.lab6;

import java.util.function.IntFunction;

/**
 *
 * Created by Andrew Tobilko on 11/15/2016.
 *
 */
public enum Offset {

    LINEAR(t -> 3 * t + 1),
    NONLINEAR(t -> (int)(8 * Math.pow(t, 2) + 4 * t + 9)),
    BY_PHRASE(t -> t); // s -> s.charAt(t) - offset

    private IntFunction<Integer> function;

    Offset(IntFunction<Integer> function) {
        this.function = function;
    }

    public int calculate(int t) {
        return function.apply(t);
    }

}

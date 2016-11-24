package com.tobilko.lab56;

import java.util.function.IntFunction;

/**
 *
 * Created by Andrew Tobilko on 11/15/2016.
 *
 */
public class OffsetStrategy {

    public enum Name {
        L("L"),
        NL("NL"),
        PHRASE("PHRASE");

        private String name;

        Name(String value) {
            name = value;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private final IntFunction<Integer> function;

    public OffsetStrategy(String name, String key) {
        if(name.equals(Name.L.toString())) {
            String[] a = key.split(" ");
            if(a.length == 2) {
                function = k -> Integer.parseInt(a[0]) * k + Integer.parseInt(a[1]);
            } else {
                throw new IllegalArgumentException("Linear method : parse error");
            }
        } else if (name.equals(Name.NL.toString())) {
            String[] a = key.split(" ");
            if(a.length == 3) {
                function = k -> (int)(Integer.parseInt(a[0]) * Math.pow(k ,2) + Integer.parseInt(a[1]) * k + Integer.parseInt(a[2]));
            } else {
                throw new IllegalArgumentException("Nonlinear method : parse error");
            }
        } else if (name.equals(Name.PHRASE.toString())) {
            function = t -> (int)(key.charAt(t % key.length()) - 'a');
        } else {
            throw new IllegalArgumentException("There is no method with the given name!");
        }
    }

    public int calculate(int t) {
        return function.apply(t);
    }

}
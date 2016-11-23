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
        PHRASE("L");

        private String name;

        Name(String value) {
            name = value;
        }

        @Override
        public String toString() {
            return name;
        }
    }

/*    CONSTANT("C", t -> 3),
    LINEAR("L", t -> 3 * t + 1),
    NONLINEAR("NL", t -> (int)(8 * Math.pow(t, 2) + 4 * t + 9)),
    BY_PHRASE("PH", t -> {
        String s = "jskdfljks dfpsd fjksd flksdjf l;sjf kl;s djf";
        return (int)s.charAt(t % s.length());
    });*/

    private final String name;
    private final IntFunction<Integer> function;

    public OffsetStrategy(String name, String key) {
        if(name.equals(Name.L.toString())) {
            String[] a = key.split(" ");
            if(a.length == 2) {

            } else {
                throw new IllegalArgumentException("Linear method : error");
            }
        } else if (name.equals(Name.NL.toString())) {

        } else if (name.equals(Name.PHRASE.toString())) {

        } else {
            throw new IllegalArgumentException("There is no method with the given name!");
        }
    }

    public int calculate(int t) {
        return function.apply(t);
    }

}
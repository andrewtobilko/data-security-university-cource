package com.tobilko.lab5;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.IntStream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

/**
 *
 * Created by Andrew Tobilko on 11/10/2016.
 *
 */
public class AlphabetUtils {

    public static Map<Character, Integer> getOrderedAlphabet(Alphabet alphabet) {
        return getAlphabet(alphabet.getSize() + 1,
                           alphabet.getFirstLetterShift(),
                           identity());
    }

    public static Map<Character, Integer> getShiftedAlphabet(Alphabet alphabet, int shift) {
        int size = alphabet.getSize() + 1;
        return getAlphabet(size,
                           alphabet.getFirstLetterShift(),
                           i -> (i + shift) % size);
    }

    private static Map<Character, Integer> getAlphabet(int size, int firstLetterShift, Function<Integer, Integer> position) {
        return IntStream.range(0, size)
                        .boxed()
                        .collect(toMap(i -> (char)(i + firstLetterShift), position));
    }

}

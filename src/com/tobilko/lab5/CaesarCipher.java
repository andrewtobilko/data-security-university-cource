package com.tobilko.lab5;

import java.util.function.IntFunction;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

/**
 *
 * Created by Andrew Tobilko on 11/10/2016.
 *
 */
public class CaesarCipher {

    protected int size;
    protected int shift;
    protected final int key;

    public CaesarCipher(Alphabet alphabet, int k) {
        size = alphabet.getSize();
        shift = alphabet.getFirstLetterShift();

        key = k;
    }
    public CaesarCipher(Alphabet alphabet) { this(alphabet, 3); }
    public CaesarCipher(int k) { this(Alphabet.ENG, k); }
    public CaesarCipher() { this(Alphabet.ENG, 3); }

    public String encode(String toEncode) { return xxcode(toEncode, i -> (char)(encode(i - shift) + shift)); }
    public String decode(String toDecode) { return xxcode(toDecode, i -> (char)(decode(i - shift) + shift)); }

    protected String xxcode(String s, IntFunction<Character> function) {
        return s.trim().contains(" ") ?
                stream(s.split(" ")).map(st -> xxcodeForOne(st, function)).collect(joining(" ")) :
                xxcodeForOne(s, function);
    }
    private String xxcodeForOne(String s, IntFunction<Character> function) {
        return s.trim().chars().mapToObj(function).map(String::valueOf).collect(joining());
    }

    protected int encode(int i) { return ((i + key) % size) - ((i + key) < 0 || (i + key) > size ? size : 0); }
    protected int decode(int i) { return ((i - key) % size) + ((i - key) < 0 || (i - key) > size ? size : 0); }

}

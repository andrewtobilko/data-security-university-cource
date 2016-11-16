package com.tobilko.lab6;

import com.sun.istack.internal.NotNull;
import com.tobilko.lab5.Alphabet;
import lombok.RequiredArgsConstructor;

/**
 *
 * Created by Andrew Tobilko on 11/14/2016.
 *
 */
@RequiredArgsConstructor
public class TrithemiusCipher {

    private @NotNull Alphabet alphabet;

    public String encode(String toEncode) {
        String s = "";
        char[] chars = toEncode.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            char character = chars[i];
            int originalIndex = character - alphabet.getFirstLetterShift();
            System.out.print(character + " (" + originalIndex + ")");
            int offset = Offset.LINEAR.calculate(i);
            System.out.print(" [" + offset + "] ");
            int cipheredIndex = encodeCharacterIndex(originalIndex, offset);
            char cipheredCharacter = (char)(cipheredIndex + alphabet.getFirstLetterShift());
            System.out.println(cipheredCharacter + " (" + cipheredIndex + ")");
        }
        return null;
    }

    public String decode(String toDecode) {
        return null;
    }

    private int encodeCharacterIndex(int originCharacterIndex, int offset) {
        return (originCharacterIndex + offset) % alphabet.getSize();
    }

    private int decodeByGivenIndex(int cipheredIndex, int offset) {
        return (cipheredIndex - offset) % alphabet.getSize();
    }



}
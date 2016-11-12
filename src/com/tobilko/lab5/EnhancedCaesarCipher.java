package com.tobilko.lab5;

import org.apache.commons.collections4.BidiMap;

import java.io.IOException;

/**
 *
 * Created by Andrew Tobilko on 11/10/2016.
 *
 */
public class EnhancedCaesarCipher extends CaesarCipher {

    private BidiMap<Character, Integer> map;

    public EnhancedCaesarCipher(String fileName, int key) {
        super(key);
        try {
            map = CaesarUtils.getCustomAlphabetFromFile(fileName);
            super.size = map.size();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String encode(String toEncode) {
        return null;
    }

    @Override
    public String decode(String toDecode) {
        return null;
    }

}

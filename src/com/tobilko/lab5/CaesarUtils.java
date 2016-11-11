package com.tobilko.lab5;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;

import java.io.IOException;
import java.nio.file.Paths;

import static java.nio.file.Files.lines;
import static java.util.stream.IntStream.range;

/**
 *
 * Created by Andrew Tobilko on 11/10/2016.
 *
 */
public class CaesarUtils {

    public static String[] takeOverAllPossibleWays(String encoded, Alphabet alphabet) {
        return range(0, alphabet.getSize() - 1)
                .mapToObj(i -> new CaesarCipher(alphabet, i).decode(encoded))
                .toArray(String[]::new);
    }

    public static BidiMap<Character, Integer> getCustomAlphabetFromFile(String fileName) throws IOException {
        return lines(Paths.get(fileName))
                .collect(DualHashBidiMap<Character, Integer>::new, (map, s) -> {
                    String[] a = s.split(" ");
                    map.put(a[0].charAt(0), Integer.valueOf(a[1]));
                }, BidiMap::putAll);
    }

}

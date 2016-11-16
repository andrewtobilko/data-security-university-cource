package com.tobilko.lab5;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Collectors;

import static java.nio.file.Files.*;
import static java.nio.file.Files.lines;
import static java.nio.file.Paths.*;
import static java.nio.file.Paths.get;
import static java.util.stream.Collectors.*;
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

}

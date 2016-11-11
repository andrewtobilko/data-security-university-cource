package com.tobilko.lab5;


import java.io.IOException;
import java.util.Arrays;

import static com.tobilko.lab5.CaesarUtils.*;

/**
 *
 * Created by Andrew Tobilko on 11/10/2016.
 *
 */
public class CaesarTest {

    public static void main(String[] args) throws IOException {

        // 1.1 : encoding/decoding by an alphabet
        CaesarCipher a1 = new CaesarCipher();
        System.out.println(a1.decode(a1.encode("WHEN I COME AROUND")));

        CaesarCipher a2 = new CaesarCipher(Alphabet.RUS, 10);
        System.out.println(a2.decode(a2.encode("КОГДА Я ВЕРНУСЬ")));

        // 1.2 : encoding/decoding by a file
        System.out.println(new EnhancedCaesarCipher("alphabet.txt", 3).encode("AAA"));

        // 2 : take over all possible keys to decode a string
        System.out.println(Arrays.toString(takeOverAllPossibleWays(a1.encode("WHEN I COME AROUND"), Alphabet.ENG)));

    }

}

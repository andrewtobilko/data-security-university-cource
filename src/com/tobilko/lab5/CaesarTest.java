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

            // 1.2 : getting a encoded String from a file and decoding that
            System.out.println(a1.decode(FileUtils.readStringFromFile("input.data")));

            // 1.3 : writing a encoded String to a file
            FileUtils.writeStringToFile("output.data", a1.encode("HELLO WORLD!"));

        // 2 : take over all possible keys to decode a string
        System.out.println(Arrays.toString(takeOverAllPossibleWays(a1.encode("WHEN I COME AROUND"), Alphabet.ENG)));

    }

}

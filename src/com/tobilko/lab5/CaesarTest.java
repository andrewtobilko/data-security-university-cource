package com.tobilko.lab5;

/**
 *
 * Created by Andrew Tobilko on 11/10/2016.
 *
 */
public class CaesarTest {

    public static void main(String[] args) {

        CaesarCipher a1 = new CaesarCipher();
        System.out.println(a1.decode(a1.encode("WHEN I COME AROUND")));

        CaesarCipher a2 = new CaesarCipher(Alphabet.RUS, 10);
        System.out.println(a2.decode(a2.encode("КОГДА Я ВЕРНУСЬ")));

    }

}

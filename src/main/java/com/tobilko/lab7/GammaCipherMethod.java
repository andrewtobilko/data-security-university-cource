package com.tobilko.lab7;

import java.io.IOException;
import java.util.Random;

import static java.nio.file.Files.lines;
import static java.nio.file.Paths.get;
import static java.util.stream.Collectors.joining;

public class GammaCipherMethod {

    private Generator generator;
    private String in;

    public GammaCipherMethod(ConsoleLineArguments arguments) throws IOException {
        in = lines(get(arguments.getSource())).collect(joining());
        generator = new Generator(in, arguments.getKey());
    }

    public void perform(String s) {

    }

    private class Generator {

        private long key;

        public Generator(String s, long key) {
            if (s.length() > 2e48) {
                throw new IllegalArgumentException("Can't create a generator [the string is too long].")
            }
        }

        public long generate() {
            // period = 2^48
            return new Random(key).nextLong();
        }

    }

}

package com.tobilko.lab56;

import java.io.IOException;
import java.nio.file.Files;

import static java.nio.file.Files.lines;
import static java.nio.file.Paths.get;
import static java.util.stream.Collectors.joining;

/**
 *
 * Created by Andrew Tobilko on 11/14/2016.
 *
 */
public class FileUtils {

    public static String read(String fileName) throws IOException {
        return lines(get(fileName)).collect(joining());
    }

    public static void write(String fileName, String string) throws IOException {
        Files.write(get(fileName), string.getBytes());
    }

}

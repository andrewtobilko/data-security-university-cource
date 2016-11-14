package com.tobilko.lab5;

import java.io.IOException;

import static java.nio.file.Files.lines;
import static java.nio.file.Files.write;
import static java.nio.file.Paths.get;
import static java.util.stream.Collectors.joining;

/**
 *
 * Created by Andrew Tobilko on 11/14/2016.
 *
 */
public class FileUtils {

    public static String readStringFromFile(String fileName) throws IOException {
        return lines(get(fileName)).collect(joining());
    }

    public static void writeStringToFile(String fileName, String string) throws IOException {
        write(get(fileName), string.getBytes());
    }

}

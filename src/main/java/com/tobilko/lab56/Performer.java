package com.tobilko.lab56;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * Created by Andrew Tobilko on 11/17/2016.
 *
 */
public class Performer {

    public void perform(String fileSettingsName) throws IOException {
        Settings settings = new SettingsReader().getSettings(fileSettingsName);

        String file = FileUtils.read(settings.getSource());

        Set<Character> invalidChars = validate(file);
        if(invalidChars.size() == 0) {
            Algorithm algorithm = new Algorithm(settings.getStrategy());
            FileUtils.write(settings.getOutput(), algorithm.execute(file, settings.isEncode()));
        } else {
            System.out.println(invalidChars);
            throw new RuntimeException("The file doesn't match the alphabet!");
        }
    }


    private Set<Character> validate(String source) {
        Set<Character> set = new HashSet<>();
        for (char c : source.toCharArray()) {
            if (!Algorithm.ALPHABET.contains(String.valueOf(c))) {
                set.add(c);
            }
        }
        return set;
    }

    public static void main(String[] args) throws IOException {

        new Performer().perform("settings.json");

    }

}

package com.tobilko.lab56;

import java.io.IOException;

/**
 *
 * Created by Andrew Tobilko on 11/17/2016.
 *
 */
public class Performer {

    public void perform(String fileSettingsName) throws IOException {
        Settings settings = new SettingsReader().getSettings(fileSettingsName);

        String alphabet = settings.getAlphabet();
        String file = FileUtils.read(settings.getSource());

        Algorithm algorithm = new Algorithm(settings.getMethod().getStrategy(), alphabet);
        FileUtils.write(settings.getOutput(), algorithm.execute(file, settings.isEncode()));
        System.out.println("The file does not match the given alphabet!");
    }

}

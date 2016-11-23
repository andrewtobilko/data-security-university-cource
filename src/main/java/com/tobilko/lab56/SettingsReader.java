package com.tobilko.lab56;

import org.json.JSONObject;

import java.io.IOException;

import static java.nio.file.Files.lines;
import static java.nio.file.Paths.get;
import static java.util.stream.Collectors.joining;

public class SettingsReader {

    public Settings getSettings(String fileName) {
        try {
            JSONObject json = new JSONObject(lines(get(fileName)).collect(joining()));
            String method = json.getString("method");
            return new Settings(
                    json.getBoolean("encode"),
                    new Method(json.getString("method"), new OfferStrategy(json.getString("key"))),
                    json.getString("source"),
                    json.getString("output")
            );
        } catch (IOException e) {
            throw new IllegalArgumentException("Couldn't read the settings file!", e);
        }
    }

}

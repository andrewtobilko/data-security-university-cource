package com.tobilko.lab56;

import com.tobilko.lab6.OffsetStrategy;
import org.json.JSONObject;

import java.io.IOException;

import static java.nio.file.Files.lines;
import static java.nio.file.Paths.get;
import static java.util.stream.Collectors.joining;

/**
 *
 * Created by Andrew Tobilko on 11/17/2016.
 *
 */
public class SettingsReader {

    public Settings getSettings(String fileName) {
        try {
            JSONObject json = new JSONObject(lines(get(fileName)).collect(joining()));
            String method = json.getString("method");
            return new Settings(
                json.getString("alphabet"),
                method.contains(":") ?
                        new Method(method.split(":")[0], OffsetStrategy.getStrategyByName(method.split(":")[1])) :
                        new Method(method, OffsetStrategy.CONSTANT),
                json.getBoolean("encode"),
                json.getString("source"),
                json.getString("output")
            );
        } catch (IOException e) {
            throw new IllegalArgumentException("Couldn't read the settings file!", e);
        }
    }

}

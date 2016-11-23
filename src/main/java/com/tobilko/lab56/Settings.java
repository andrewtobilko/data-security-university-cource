package com.tobilko.lab56;

import java.math.BigDecimal;

/**
 *
 * Created by Andrew Tobilko on 11/17/2016.
 *
 */
public class Settings {

    private boolean encode;
    private String source;
    private String output;

    public Settings(boolean encode, String source, String output) {
        this.encode = encode;
        this.source = source;
        this.output = output;
    }

    public boolean isEncode() { return encode; }
    public String getSource() { return source; }
    public String getOutput() { return output; }

}
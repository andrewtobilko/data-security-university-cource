package com.tobilko.lab56;

import java.math.BigDecimal;

/**
 *
 * Created by Andrew Tobilko on 11/17/2016.
 *
 */
public class Settings {

    private boolean encode;
    private OffsetStrategy strategy;
    private String source;
    private String output;

    public Settings(boolean encode, OffsetStrategy strategy, String source, String output) {
        this.encode = encode;
        this.strategy = strategy;
        this.source = source;
        this.output = output;
    }

    public boolean isEncode() { return encode; }
    public String getSource() { return source; }
    public String getOutput() { return output; }
    public OffsetStrategy getStrategy() { return strategy; }

}
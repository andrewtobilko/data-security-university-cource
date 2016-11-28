package com.tobilko.lab7;

public class ConsoleLineArguments {

    private String source;
    private String output;
    private long key;

    public ConsoleLineArguments(String source, String output, long key) {
        this.source = source;
        this.output = output;
        this.key = key;
    }

    public String getSource() {
        return source;
    }

    public String getOutput() {
        return output;
    }

    public long getKey() {
        return key;
    }

}

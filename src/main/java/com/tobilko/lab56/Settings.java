package com.tobilko.lab56;

/**
 *
 * Created by Andrew Tobilko on 11/17/2016.
 *
 */
public class Settings {

    private String alphabet;
    private Method method;

    private boolean encode;

    private String source;
    private String output;

    public Settings(String alphabet, Method method, boolean encode, String source, String output) {
        this.alphabet = alphabet;
        this.method = method;
        this.encode = encode;
        this.source = source;
        this.output = output;
    }

    public String getAlphabet() {
        return alphabet;
    }

    public Method getMethod() {
        return method;
    }

    public boolean isEncode() {
        return encode;
    }

    public String getSource() {
        return source;
    }

    public String getOutput() {
        return output;
    }

}

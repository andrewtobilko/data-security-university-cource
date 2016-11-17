package com.tobilko.lab56;

import com.tobilko.lab6.OffsetStrategy;

/**
 *
 * Created by Andrew Tobilko on 11/17/2016.
 *
 */
public class Method {

    private String title;
    private OffsetStrategy strategy;

    public Method(String title, OffsetStrategy strategy) {
        this.title = title;
        this.strategy = strategy;
    }

    public String getTitle() {
        return title;
    }

    public OffsetStrategy getStrategy() {
        return strategy;
    }

}

package org.videoEditor;

public abstract class Shape {
    private String figure;

    public Shape(String figure) {
        this.figure = figure;
    }

    public String getName() {
        return this.figure;
    }
}

package com.serenitydojo;

public abstract class Pet {
    private String name;

    protected Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String makeNoise();

    public abstract String play();
}

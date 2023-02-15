package com.serenitydojo;

public class Hamster extends Pet {
    private final int age;
    private final String favoriteGame;

    public Hamster(String name, int age, String favoriteGame) {
        super(name);
        this.age = age;
        this.favoriteGame = favoriteGame;

    }

    @Override
    public String makeNoise() {
        return "Skwik";
    }

    @Override
    public String play() {
        return "runs in " + favoriteGame.toLowerCase();
    }
}

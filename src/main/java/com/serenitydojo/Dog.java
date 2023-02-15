package com.serenitydojo;

public class Dog extends Pet {
    public static final String DOG_NOISE = "Woof";
    private String favoriteToy;
    private boolean isFed = false;

    public Dog(String name, String favoriteToy, int age) {
        super(name, age);
        this.favoriteToy = favoriteToy;
    }


    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }


    public boolean isFed() {
        return isFed;
    }

    // Exercise 4
    public String makeNoise() {
        return DOG_NOISE;
    }

    @Override
    public String play() {
        return "plays with " + favoriteToy.toLowerCase();
    }

    public void feed() {
        this.isFed = true;
    }
}

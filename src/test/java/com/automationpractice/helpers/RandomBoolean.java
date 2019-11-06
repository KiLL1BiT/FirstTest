package com.automationpractice.helpers;

public class RandomBoolean {
    public static boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }

    public boolean randomGender = getRandomBoolean();

}
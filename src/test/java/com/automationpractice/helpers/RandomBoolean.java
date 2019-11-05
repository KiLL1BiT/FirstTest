package com.automationpractice.helpers;

public class RandomBoolean {
    public static boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }

    public boolean randomGender = getRandomBoolean();

}

//public class RandArray {
//    private int[] items = new int[]{0, 1};
//
//    private Random rand = new Random();
//
//    public int getRandArrayElement(){
//        return items[rand.nextInt(items.length)];
//    }
//}
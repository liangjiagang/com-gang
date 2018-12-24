package com.liangjiagang.servicegangweb.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomColor {

    private static List<String> list = new ArrayList<>();

    static {
        list.add("#f4cb3c");
        list.add("#38f490");
        list.add("#55b8f4");
        list.add("#f482b2");
        list.add("#f4a2a3");
        list.add("#f4ad5c");
        list.add("#f47e82");
        list.add("#b6b2f4");
        list.add("#d7f48b");
        list.add("#f4daaa");
    }

    public RandomColor(){}

    public static String getRandomColor(){
        int a = new Random().nextInt(10);
        return list.get(a);
    }

}

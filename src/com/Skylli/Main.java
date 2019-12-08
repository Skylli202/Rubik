package com.Skylli;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("tamer");

        int a = (int)(255*(Math.pow(2,16)) + (127*(Math.pow(2,8))) + 15);
        Color test = new Color(a);
        System.out.println("Red :"+test.getRed());
        System.out.println("Gre :"+test.getGreen());
        System.out.println("Blu :"+test.getBlue());

        int getRed = (int)(a/(Math.pow(2,16)));
        System.out.println("getRed :"+getRed);

        int getGreen = (int)(Math.pow(2,16)-1 - a/Math.pow(2,8));
        System.out.println("getGreen :"+getGreen);

        int getBlue = (int)(Math.pow(2,16)-1 - Math.pow(2,8)-1 - a/Math.pow(2,0));
        System.out.println("getBlue :"+getBlue);
    }
}

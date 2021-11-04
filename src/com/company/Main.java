package com.company;

public class Main {

    public static void main(String[] args) {

        car newcar = new car();
        newcar.name = "Ferrari";
        newcar.color = "blue";
        newcar.doors = 3;
        newcar.engineCapacity ="60000cc";

        System.out.println(newcar.color);
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {

        car newcar = new car();

        newcar.name = "Lambo";
        newcar.engineCapacity = "45678cc";
        newcar.doors = 7;
        newcar.model = "aventador";

        System.out.println(newcar.model);

    }
}

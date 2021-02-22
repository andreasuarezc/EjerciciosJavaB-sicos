package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 10;
        int y = 15;

        if (x > y) {
            System.out.println("El número mayor es: " + x);
        } else if (y > x) {
            System.out.println("El número mayor es: " + y);
        } else {
            System.out.println("Los dos números son iguales");
        }
    }
}

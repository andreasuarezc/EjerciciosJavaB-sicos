package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int x = 0;
        ArrayList<Integer> par = new ArrayList<Integer>();
        ArrayList<Integer> impar = new ArrayList<Integer>();
        while (x <= 100) {
            if (x % 2 == 0) {
                par.add(x);
            } else {
                impar.add(x);
            }
            x++;
        }
        System.out.println("La lista de numeros par es: ");
        System.out.println(par);
        System.out.println("La lista de números impar es: " );
        System.out.println(impar);
    }
}

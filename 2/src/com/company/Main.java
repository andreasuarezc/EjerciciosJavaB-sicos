package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer número entero"));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo entero"));

        if (x > y) {
            System.out.println("El número mayor es: " + x);
        } else if (y > x) {
            System.out.println("El número mayor es: " + y);
        } else {
            System.out.println("Los dos números son iguales");
        }
    }
}

package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int x = 0;
        do {
            x = Integer.parseInt(JOptionPane.
                    showInputDialog(null, "Ingrese un número entero"));
        } while (x < 0);
        System.out.println("El número ingresado mayor o igual a cero es: "+x);
    }
}

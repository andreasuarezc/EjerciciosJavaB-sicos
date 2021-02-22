package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Ingrese una frase");
        frase = frase.replace(" ", "");
        System.out.println(frase);
    }
}

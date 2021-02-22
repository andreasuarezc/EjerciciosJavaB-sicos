package com.company;

import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero entero"));
            while (x <= 1000) {
                System.out.println(x);
                x = x + 2;
            }
        }catch (Exception e){
            System.out.println(e.getMessage()+"El número ingresado no es un entero");
        }

    }
}

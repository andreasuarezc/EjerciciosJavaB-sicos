package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        String palabra1 = JOptionPane.showInputDialog("Ingresa una palabra");
        String palabra2 = JOptionPane.showInputDialog("Ingresa una palabra");
        String palabra3 = "";
        String palabra4 = "";
        char letra1;
        char letra2;

        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println("Las dos palabras son iguales");
        } else {
            int tamaño1 = palabra1.length();
            int tamaño2 = palabra2.length();
            int x = 0;
            int y = tamaño2;
            int z = tamaño1;
            if (tamaño1 > tamaño2) {
                while (x < tamaño2) {
                    letra1 = palabra1.charAt(x);
                    letra2 = palabra2.charAt(x);
                    if (letra1 == letra2) {
                        palabra3 = palabra3 + "*";
                        palabra4 = palabra4 + "*";
                    } else {
                        palabra3 = palabra3 + letra1;
                        palabra4 = palabra4 + letra2;
                    }
                    x++;
                }

                while (y<tamaño1) {
                    letra1 = palabra1.charAt(y);
                    palabra3 = palabra3 + letra1;
                    y++;
                }
                System.out.println("Las dos palabras ingresadas presentan las siguientes diferencias:");
                System.out.println(palabra3);
                System.out.println(palabra4);

            } else if (tamaño2 > tamaño1){
                while (x < tamaño1) {
                    letra1 = palabra1.charAt(x);
                    letra2 = palabra2.charAt(x);
                    if (letra1 == letra2) {
                        palabra3 = palabra3 + "*";
                        palabra4 = palabra4 + "*";
                    } else {
                        palabra3 = palabra3 + letra1;
                        palabra4 = palabra4 + letra2;
                    }
                    x++;
                }
                while (z<tamaño2) {
                    letra2 = palabra2.charAt(z);
                    palabra4 = palabra4 + letra2;
                    z++;
                }
                System.out.println("Las dos palabras ingresadas presentan las siguientes diferencias:");
                System.out.println(palabra3);
                System.out.println(palabra4);
            }else{
                while (x < tamaño1) {
                    letra1 = palabra1.charAt(x);
                    letra2 = palabra2.charAt(x);
                    if (letra1 == letra2) {
                        palabra3 = palabra3 + "*";
                        palabra4 = palabra4 + "*";
                    } else {
                        palabra3 = palabra3 + letra1;
                        palabra4 = palabra4 + letra2;
                    }
                    x++;
                }
                System.out.println("Las dos palabras ingresadas presentan las siguientes diferencias:");
                System.out.println(palabra3);
                System.out.println(palabra4);
            }


        }


    }
}

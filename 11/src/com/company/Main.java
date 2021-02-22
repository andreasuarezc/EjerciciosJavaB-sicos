package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog(null, "Ingrese una frase");
	    int longitud = frase.length();
        System.out.println("La frase ingresada tiene una longitud de: "+longitud);
        int contador =0;
        int a=0;
        int e=0;
        int i=0;
        int o=0;
        int u=0;
        while (contador<frase.length()){
            char letra = frase.charAt(contador);
            System.out.println(letra);
            if(letra=='a'){
                a++;
            }else if(letra=='e'){
                e++;
            }else if (letra=='i'){
                i++;
            }else if (letra=='o'){
                o++;
            }else if (letra=='u'){
                u++;
            }
            contador++;
        }
        System.out.println("La frase tiene "+a+" veces la vocal a");
        System.out.println("La frase tiene "+e+" veces la vocal e");
        System.out.println("La frase tiene "+i+" veces la vocal i");
        System.out.println("La frase tiene "+o+" veces la vocal o");
        System.out.println("La frase tiene "+u+" veces la vocal u");
    }
}

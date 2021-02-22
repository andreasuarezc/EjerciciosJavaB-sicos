package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	double precioProducto;
	precioProducto = Double.parseDouble(JOptionPane.showInputDialog
            (null,"Ingrese el precio del producto"));
	double precioFinal = precioProducto + (precioProducto*0.21);
        System.out.println("El precio Final del producto registrado es: "+precioFinal);
    }
}

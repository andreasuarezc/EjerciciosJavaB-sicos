package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	double pi = 3.141592;
	double radio;
	radio = Double.parseDouble(JOptionPane.showInputDialog
            (null, "Ingrese el radio del circulo"));

	double areaCirculo = pi*Math.pow(radio,2);
        System.out.println("El área del circulo es: "+ areaCirculo);


    }
}

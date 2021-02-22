package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	String dia ;
	dia = JOptionPane.showInputDialog(null, "Ingresa un día de la semana");
	switch (dia.toLowerCase()){
        case "domingo":
            System.out.println(dia+" no es un día laboral");
            break;
        default:
            System.out.println(dia+" es un día laboral");
            break;
    }
    }
}

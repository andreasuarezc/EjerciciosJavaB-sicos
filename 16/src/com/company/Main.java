package com.company;

import com.company.java.Persona;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad"));
        String sexo = JOptionPane.showInputDialog(null, "Ingrese el sexo: H (Hombre), M (Mujer)");
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el peso"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura"));

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSxo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);


    }
}

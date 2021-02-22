package com.company;

import com.company.java.Persona;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad"));
        String sexo = JOptionPane.showInputDialog(null, "Ingrese el sexo: H (Hombre), M (Mujer)");
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el peso"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura"));

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        persona2.setAltura(1.75);
        persona2.setPeso(75);
        Persona persona3 = new Persona();
        persona3.setNombre("Carlos");
        persona3.setEdad(25);
        persona3.setSxo("H");
        persona3.setPeso(85.5);
        persona3.setAltura(1.78);


        System.out.println("Nombre: "+persona1.getNombre());
        System.out.println("Dni: "+persona1.getDni());
        System.out.println("Edad: "+persona1.getEdad());
        System.out.println("Sexo: "+persona1.getSexo());
        System.out.println(persona1.comprobarPesoIdeal());
        System.out.println(persona1.esMayorDeEdad());
        System.out.println("Nombre: "+persona2.getNombre());
        System.out.println("Dni: "+persona2.getDni());
        System.out.println("Edad: "+persona2.getEdad());
        System.out.println("Sexo: "+persona2.getSexo());
        System.out.println(persona2.comprobarPesoIdeal());
        System.out.println(persona2.esMayorDeEdad());
        System.out.println("Nombre: "+persona3.getNombre());
        System.out.println("Dni: "+persona3.getDni());
        System.out.println("Edad: "+persona3.getEdad());
        System.out.println("Sexo: "+persona3.getSexo());
        System.out.println(persona3.comprobarPesoIdeal());
        System.out.println(persona3.esMayorDeEdad());



    }
}

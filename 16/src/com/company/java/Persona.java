package com.company.java;

import java.util.Random;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private int dni;
    private String sexo;
    private double peso = 0;
    private double altura = 0;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSxo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC() {
        double formula = peso / (Math.pow(altura, 2));
        int x = 0;
        if (formula < 20) {
            x = -1;
        } else if (formula <= 25) {
            x = 0;
        } else if (formula > 25) {
            x = 1;
        }
        return x;
    }

    public boolean esMayorDeEdad() {
        if (altura > 17) {
            return true;
        } else {
            return false;
        }
    }

    public String comprobarSexo(String sexo) {
        if (sexo == "H" || sexo == "M") {
            return sexo;
        } else {
            return "H";
        }

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + dni + '\'' +
                ", SEXO=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public int generarDNI() {
        Random numeroAleatorio = new Random();
        int x = numeroAleatorio.nextInt(99999999 - 10000000 + 1) + 10000000;
        return x;
    }
}

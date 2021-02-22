package com.company.java;

import java.util.Random;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private int dni = generarDNI();
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
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
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
        if (formula < 20) {
            return -1;
        } else if (formula <= 25) {
            return 0;
        }return 1;
    }

    public String  comprobarPesoIdeal(){
        if(calcularIMC()==1) return nombre +" tiene sobrepeso";
        if(calcularIMC()==0) return nombre + " está por debajo de su peso ideal";
        return nombre + " tiene un peso saludable";
    }

    public String esMayorDeEdad() {
        if (altura > 17) {
            return nombre + " es mayor de edad";
        } else {
            return nombre + " es menor de edad";
        }
    }

    public String comprobarSexo(String sexo) {
        if (sexo.equals("H") || sexo.equals("M")) {
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
        Random rand = new Random();
        return rand.nextInt(99999999 - 10000000 + 1) + 10000000;
    }
}

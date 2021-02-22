package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("****** GESTION CINEMATOGRÁFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6-VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR"));
            while (opcion < 8) {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("****** GESTION CINEMATOGRÁFICA ********\n" +
                        "1-NUEVO ACTOR\n" +
                        "2-BUSCAR ACTOR\n" +
                        "3-ELIMINAR ACTOR\n" +
                        "4-MODIFICAR ACTOR\n" +
                        "5-VER TODOS LOS ACTORES\n" +
                        "6-VER PELICULAS DE LOS ACTORES\n" +
                        "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                        "8-SALIR"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " OPCION INCORRECTO");
        }


    }
}

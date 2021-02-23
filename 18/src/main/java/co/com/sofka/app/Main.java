package main.java.co.com.sofka.app;

import main.java.co.com.sofka.app.modelo.Serie;
import main.java.co.com.sofka.app.modelo.VideoJuego;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<VideoJuego> listaVideoJuegos = new ArrayList<>();
        VideoJuego guerra = new VideoJuego("Halo", 12, "Guerra", "XZ");
        VideoJuego guilty = new VideoJuego("Guilty", 24, "Accion", "XZ");
        VideoJuego resident = new VideoJuego("Resident Evil", 10, "Armas", "Afgt");
        VideoJuego car10 = new VideoJuego("car", 10, "velocidad", "Ferra");
        VideoJuego wrc9 = new VideoJuego("WRC9", 12, "pista", "gbhn");
        listaVideoJuegos.add(guerra);
        listaVideoJuegos.add(guilty);
        listaVideoJuegos.add(resident);
        listaVideoJuegos.add(car10);
        listaVideoJuegos.add(wrc9);
        ArrayList<Serie> listadeSeries = new ArrayList<>();
        Serie oiu = new Serie();
        Serie aventurasVerano = new Serie("AventuraVerano", "Pixar");
        Serie juegosMax = new Serie("JuegosMax", "Disney");
        Serie juntos = new Serie("juntos", "Netflix");
        Serie Rocklj = new Serie("Rocklj", 7, "Romance", "Pixar");
        listadeSeries.add(oiu);
        listadeSeries.add(aventurasVerano);
        listadeSeries.add(juegosMax);
        listadeSeries.add(juntos);
        listadeSeries.add(Rocklj);
        System.out.println(listaVideoJuegos);
        System.out.println(listadeSeries);
        oiu.entregar();
        juegosMax.entregar();
        juntos.entregar();
        resident.entregar();
        guerra.entregar();
        int contador = 0;
        for (int i = 0; i<listaVideoJuegos.size(); i++){
            VideoJuego objeto = listaVideoJuegos.get(i);
            if(objeto.isEntregado()==true){
                objeto.devolver();
                contador++;
            }
        }
        System.out.println("Se devolvieron "+contador+" Video Juegos");
        int contador2 = 0;
        for (int i = 0; i<listadeSeries.size(); i++){
            Serie objeto = listadeSeries.get(i);
            if(objeto.isEntregado()==true){
                objeto.devolver();
                contador2++;
            }
        }
        System.out.println("Se devolvieron "+contador2+" Series");
        Serie masTemporadas = aventurasVerano;
        for(int i = 0; i<listadeSeries.size(); i++){
            if(masTemporadas.compareTo(listadeSeries.get(i))==-1){
                masTemporadas = listadeSeries.get(i);
            }
        }
        System.out.println(masTemporadas + " es la Serie con más temporadas");
        VideoJuego mashoras = guerra;
        for(int i = 0; i<listaVideoJuegos.size(); i++){
            if(mashoras.compareTo(listaVideoJuegos.get(i))==-1){
                mashoras = listaVideoJuegos.get(i);
            }
        }
        System.out.println(mashoras + " es el Video Juego con más horas estimadas");
    }
}

package main.java.co.com.sofka.app.modelo;

public class VideoJuego implements Entregable{
    private String titulo;
    private int horasestimadas = 10;
    private boolean entregado = false;
    private char genero;
    private String compañia;

    public VideoJuego() {
    }

    public VideoJuego(String titulo, int horasestimadas) {
        this.titulo = titulo;
        this.horasestimadas = horasestimadas;
    }

    public VideoJuego(String titulo, int horasestimadas, char genero, String compañia) {
        this.titulo = titulo;
        this.horasestimadas = horasestimadas;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasestimadas() {
        return horasestimadas;
    }

    public void setHorasestimadas(int horasestimadas) {
        this.horasestimadas = horasestimadas;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", horasestimadas=" + horasestimadas +
                ", entregado=" + entregado +
                ", genero=" + genero +
                ", compañia='" + compañia + '\'' +
                '}';
    }


    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public void compareTo(Object a) {

    }
}

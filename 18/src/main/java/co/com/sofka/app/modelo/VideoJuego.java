package main.java.co.com.sofka.app.modelo;

public class VideoJuego implements Entregable{
    private String titulo;
    private int horasestimadas = 10;
    private boolean entregado = false;
    private String genero;
    private String compañia;

    public VideoJuego() {
    }

    public VideoJuego(String titulo, int horasestimadas) {
        this.titulo = titulo;
        this.horasestimadas = horasestimadas;
    }

    public VideoJuego(String titulo, int horasestimadas, String genero, String compañia) {
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
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
        return "Video Juego{" +
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
    public int compareTo(Object a) {
        int resultado = 0;
        if(a instanceof VideoJuego){
            VideoJuego objeto = (VideoJuego) a;
            resultado= Integer.compare(horasestimadas, objeto.horasestimadas);
            //-1 objeto es mayor
            //0 ambos son iguales
            //1 objeto es menor
        }
        return resultado;
    }
}

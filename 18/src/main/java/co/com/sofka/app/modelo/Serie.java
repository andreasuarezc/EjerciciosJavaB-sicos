package main.java.co.com.sofka.app.modelo;

public class Serie implements Entregable{
    private String título;
    private int numeroTemporadas = 3;
    private boolean entregado = false;
    private String género = "Cultura General";
    private String creador;

    public Serie() {
    }

    public Serie(String título, String creador) {
        this.título = título;
        this.creador = creador;
    }

    public Serie(String título, int numeroTemporadas, String género, String creador) {
        this.título = título;
        this.numeroTemporadas = numeroTemporadas;
        this.género = género;
        this.creador = creador;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGénero() {
        return género;
    }

    public void setGénero(String género) {
        this.género = género;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "título='" + título + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", género=" + género +
                ", creador='" + creador + '\'' +
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
        if(a instanceof Serie){
            Serie objeto = (Serie) a;
            resultado = Integer.compare(numeroTemporadas, objeto.numeroTemporadas);
            //-1 objeto es mayor
            //0 ambos son iguales
            //1 objeto es menor
        }
        return resultado;
    }
}


package main.java.co.com.sofka.app.modelo;

public interface Entregable {

    void entregar();
    void devolver();
    boolean isEntregado();
    int compareTo(Object a);
}

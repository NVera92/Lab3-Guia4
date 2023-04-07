package Clases;

import java.time.LocalDateTime;
import java.util.Date;

public class Alquileres {

    private Date fechaRetiro;
    private LocalDateTime fechaDevolucion;
    private String cliente;
    private String tituloAlquilado;


    public Alquileres(Date fechaRetiro, LocalDateTime fechaDevolucion, String cliente, String tituloAlquilado) {
        this.fechaRetiro = fechaRetiro;
        this.fechaDevolucion = fechaDevolucion;
        this.cliente = cliente;
        this.tituloAlquilado = tituloAlquilado;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public LocalDateTime getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDateTime fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTituloAlquilado() {
        return tituloAlquilado;
    }

    public void setTituloAlquilado(String tituloAlquilado) {
        this.tituloAlquilado = tituloAlquilado;
    }

    @Override
    public String toString() {
        return "Alquileres{" +
                "fechaRetiro=" + fechaRetiro +
                ", fechaDevolucion=" + fechaDevolucion +
                ", cliente='" + cliente + '\'' +
                ", tituloAlquilado='" + tituloAlquilado + '\'' +
                '}';
    }

}

package Clases;

import java.time.LocalDateTime;

public class Peliculas {

    private String titulo;
    private String genero;
    private LocalDateTime fechaLanzamiento;
    private Integer duracion;
    private String clasificacion;
    private String paisOrigen;
    private String descripcion;
    private Integer copias;


    public Peliculas(String titulo, String genero, LocalDateTime fechaLanzamiento, Integer duracion, String clasificacion, String paisOrigen, String descripcion, Integer copias) {
        this.titulo = titulo;
        this.genero = genero;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.paisOrigen = paisOrigen;
        this.descripcion = descripcion;
        this.copias = copias;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDateTime getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDateTime fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCopias() {
        return copias;
    }

    public void setCopias(Integer copias) {
        this.copias = copias;
    }

    @Override
    public String toString() {
        return "Peliculas{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", duracion=" + duracion +
                ", clasificacion='" + clasificacion + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", copias=" + copias +
                '}';
    }


}

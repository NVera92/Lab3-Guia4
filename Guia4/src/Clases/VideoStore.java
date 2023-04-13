package Clases;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Callable;

public class VideoStore {

    private ArrayList<Peliculas> peliculas;
    private ArrayList<Clientes> clientes;
    private ArrayList<Alquileres> alquileres;

    public VideoStore() {
        this.peliculas = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.alquileres = new ArrayList<>();
    }

    /// CLIENTES
    public void altaCliente(String nombre, String telefono, String direccion) {
        this.clientes.add(new Clientes(nombre, telefono, direccion));
    }


    /// PELICULAS

    public void altaPeliculas(String titulo, String genero, LocalDateTime fechaLanzamiento, Integer duracion, String clasificacion, String paisOrigen, String descripcion, Integer copias) {
        this.peliculas.add(new Peliculas(titulo, genero, fechaLanzamiento, duracion, clasificacion, paisOrigen, descripcion, copias));
    }

    public void recorrerPeliculas() {
        for (Peliculas p : this.peliculas) {
            System.out.println(p.toString());
        }
    }

    public Boolean pDisponible(String titulo) {
        Boolean flag = false;
        for (Peliculas p : this.peliculas) {
            if (p.getTitulo() == titulo && p.getCopias() >= 1) {
                flag = true;
            }
        }

        return flag;
    }

    public void tituloDisponible(String titulo) {
        if (pDisponible(titulo)) {
            System.out.println("El titulo esta disponible");
        } else {
            System.out.println("El titulo NO esta disponible");
        }
    }


    /// Aumento de copias disponible

    /// Disminucion de copias disponibles
    public void disminucionCopia(String titulo){
        for(Peliculas p : this.peliculas){
            if(p.getTitulo() == titulo){
                int pos = this.peliculas.indexOf(p);
                this.peliculas.get(pos).setCopias(p.getCopias()-1);
            }
        }
    }


    /// Consulta de Cliente
    public Boolean cExiste(String nombre) {
        Boolean flag = false;
        for (Clientes c : this.clientes) {
            if (c.getNombre() == nombre) {
                flag = true;
            }
        }
        return flag;
    }

    /// Alta alquiler
    public void altaAlquiler(LocalDateTime fechaRetiro,LocalDateTime fechaDevolucion,String cliente,String pelicula){
        this.alquileres.add(new Alquileres(fechaRetiro,fechaDevolucion,cliente,pelicula));
    }

    public void recorrerAlquileres(){
        for(Alquileres a : this.alquileres){
            System.out.println(a.toString());
        }
    }
}



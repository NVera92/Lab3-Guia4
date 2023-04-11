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
    public void altaCliente(String nombre, String telefono, String email) {
        this.clientes.add(new Clientes(nombre, telefono, email));
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


    /// Consulta de Cliente
    public Clientes cExiste(String nombre) {
        for (Clientes c : this.clientes) {
            if (c.getNombre() == nombre) {
                return c;
            }
        }
        return null;
    }
}



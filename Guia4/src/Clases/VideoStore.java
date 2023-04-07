package Clases;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Callable;

public class VideoStore {

    private static ArrayList<Peliculas> stockPeliculas = new ArrayList<>();

    public static ArrayList<Peliculas> obtenerPeliculas() {
        return stockPeliculas;
    }

    public static void recorrerPeliculas(ArrayList<Peliculas> lista) {
        for (Peliculas p : lista) {
            System.out.println(p.toString());
        }
    }

    /// CLIENTES
    private static ArrayList<Clientes> listadoClientes = new ArrayList<>();

    public static ArrayList<Clientes> obtenerClientes() {
        return listadoClientes;
    }

    public static void recorrerClientes(ArrayList<Clientes> lista){
        for(Clientes c : lista){
            System.out.println(c.toString());
        }

    }

    /// Consulta de Sotck

    public static Boolean tituloDisponible(ArrayList<Peliculas> stock,String titulo){
        Boolean flag = false;
        for(Peliculas p : stock){
            if(p.getTitulo() == titulo && p.getCopias() >= 1){
                flag = true;
            }
        }

        return flag;
    }


    /// Disminucion de copias disponible

    public static void disminucionCopia(ArrayList<Peliculas> lista,String titulo){
        for(Peliculas p : lista){
            if(p.getTitulo() == titulo){
                p.setCopias(p.getCopias()-1);
            }
        }
    }

    /// Aumento de copias disponible
    public static void aumentoCopia(ArrayList<Peliculas> lista,String titulo){
        for(Peliculas p : lista){
            if(p.getTitulo() == titulo){
                p.setCopias(p.getCopias()+1);
            }
        }
    }

    /// Consulta de Cliente
    public static Boolean clienteExiste(ArrayList<Clientes> lista,String nombre){
        Boolean flag = false;
        for(Clientes c : lista){
            if(c.getNombre() == nombre){
                flag = true;
            }
        }
        return flag;
    }

    private static ArrayList<Alquileres> comprobantesAlquiler = new ArrayList<>();

    public static ArrayList<Alquileres> obtenerAlquileres(){
        return comprobantesAlquiler;
    }

    public static Boolean alquilerCliente(ArrayList<Alquileres> lista, String cliente){
        Boolean flag = false;
        for(Alquileres a : lista){
            if(a.getCliente() == cliente){
                flag = true;
            }
        }
        return flag;
    }

    public static void devolucionAlquiler(ArrayList<Alquileres> lista,String cliente){
        if(alquilerCliente(lista,cliente)){
            for(Alquileres a : lista){
                if(a.getCliente() == cliente){
                    System.out.println(a.toString());
                }
            }
        }
    }
}

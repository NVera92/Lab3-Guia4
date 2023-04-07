import Clases.Alquileres;
import Clases.Clientes;
import Clases.Peliculas;
import Clases.VideoStore;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /// Carga Peliculas
        VideoStore.obtenerPeliculas().add(new Peliculas("La Terminal","Comedia",new Date(),120,"PG-13","USA","Vikkktor",5));
        VideoStore.obtenerPeliculas().add(new Peliculas("El Naufrago","Accion",new Date(),105,"PG","USA","Wilsonn",2));
        VideoStore.obtenerPeliculas().add(new Peliculas("Forest Gump","Drama",new Date(),112,"G","USA","Vikkktor",5));
        //VideoStore.recorrerPeliculas(VideoStore.obtenerPeliculas());

        /// Carga Clientes
        VideoStore.obtenerClientes().add(new Clientes("Daniel","4817393","Heguilor 974"));
        VideoStore.obtenerClientes().add(new Clientes("Patricia","4650133","Finochietto 136"));
        VideoStore.obtenerClientes().add(new Clientes("Monica","4650409","Loberia 163"));
        //VideoStore.recorrerClientes(VideoStore.obtenerClientes());



        /// Comprobacion
        comprobacionTitulo("La Terminal");


        /// Alquiler
        alquiler("El Naufrago","Nicolas");

        /// Muestra de alquileres
        mostrarAlquileresCliente(VideoStore.obtenerAlquileres(),"Nicolas");




    }

    public static void comprobacionTitulo(String titulo){
        if(VideoStore.tituloDisponible(VideoStore.obtenerPeliculas(),titulo)){
            System.out.println("El titulo esta disponible");
        }else{
            System.out.println("El titulo no esta disponible");
        }
    }

    public static void alquiler(String titulo,String cliente){
        /// Comprobamos que existe la pelicula y alla al menos 1 en stock
        if(VideoStore.tituloDisponible(VideoStore.obtenerPeliculas(),titulo)){
            /// Comprobamos que el cliente exista
            do {
                System.out.println("El cliente no existe... se procedera a cargarlo en el sistema....");
                String nombre;
                String telefono;
                String direccion;
                Scanner scan = new Scanner(System.in);
                System.out.println("Carga de nuevo cliente");
                System.out.println("Ingrese el nombre:");
                nombre = scan.nextLine();
                System.out.println("Ingrese el telefono:");
                telefono = scan.nextLine();
                System.out.println("Ingrese la direccion");
                direccion = scan.nextLine();
                scan.close();
                System.out.println("Creando al cliente...");
                VideoStore.obtenerClientes().add(new Clientes(nombre,telefono,direccion));
                //VideoStore.recorrerClientes(VideoStore.obtenerClientes());

            }while(VideoStore.clienteExiste(VideoStore.obtenerClientes(),cliente));

            VideoStore.disminucionCopia(VideoStore.obtenerPeliculas(),titulo);
            LocalDateTime dia = LocalDateTime.now();
            VideoStore.obtenerAlquileres().add(new Alquileres(new Date(),dia.plusDays(3),cliente,titulo));
            System.out.println("Generando comprobante de alquiler....");




        }else{
            System.out.println("El titulo seleccionado no esta disponible");
        }

    }


    public static void mostrarAlquileresCliente(ArrayList<Alquileres> lista,String cliente){
        for(Alquileres a : lista){
            if(a.getCliente() == cliente){
                System.out.println(a.toString());
            }
        }
    }

   

}
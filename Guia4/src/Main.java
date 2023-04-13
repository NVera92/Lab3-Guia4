import Clases.Clientes;
import Clases.VideoStore;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /// Llamado de App
        VideoStore app = new VideoStore();

        /// CLIENTES
        app.altaCliente("Daniel","4817393","Heguilor 974");
        app.altaCliente("Patricia","4650133","Finochietto 136");
        app.altaCliente("Monica","4650409","Loberia 163");

        /// Mostrado de clientes
        //System.out.println(app.cExiste("Dani").getNombre());

        /// PELICULAS
        app.altaPeliculas("La Terminal","Comedia",LocalDateTime.now(),120,"PG-13","USA","Vikkktor",5);
        app.altaPeliculas("El Naufrago","Accion",LocalDateTime.now(),105,"PG","USA","Wilsonn",2);
        app.altaPeliculas("Forest Gump","Drama",LocalDateTime.now(),112,"G","USA","Vikkktor",5);

        /// Mostrado de peliculas
        app.recorrerPeliculas();

        /// Comprobacion de existencia del titulo
        app.tituloDisponible("El Naufrago");

        /// ALQUILER
        procesoAlquilado(app,"Nicolas","La Terminal");
        app.recorrerAlquileres();

    }

        public void mostradoClientes(ArrayList<Clientes> lista){
            for(Clientes c : lista){
                System.out.println(c.toString());
            }
        }

      public static void procesoAlquilado(VideoStore app){
        LocalDateTime dia = LocalDateTime.now();
        Scanner scan = new Scanner(System.in);
        String cliente;
        String titulo;

          System.out.println("Ingrese el titulo a alquilar: ");
          titulo = scan.nextLine();

          if(app.pDisponible(titulo)){
              System.out.println("El titulo esta disponible.. Redireccionando a clientes.....");
              System.out.println("Ingrese el cliente: ");
              cliente = scan.nextLine();
              



          }else {
              System.out.println("El titulo NO esta disponible");
          }


        if(app.pDisponible(titulo)){

            if(app.cExiste(cliente)){
                app.altaAlquiler(dia,dia.plusDays(3),cliente,titulo);
                app.disminucionCopia(titulo);

                System.out.println("Generando alquiler.....");
            }else{
                System.out.println("El cliente no existe, se procedera a crearlo.....");
                Scanner scan = new Scanner(System.in);
                String nombre;
                String telefono;
                String direccion;
                System.out.println("Ingrese el nombre: ");
                nombre = scan.nextLine();
                System.out.println("Ingrese el telefono: ");
                telefono = scan.nextLine();
                System.out.println("Ingrese la direccion: ");
                direccion = scan.nextLine();
                app.altaCliente(nombre,telefono,direccion);
                System.out.println("Generando alquiler.....");
                app.disminucionCopia(titulo);
                app.altaAlquiler(dia,dia.plusDays(3),cliente,titulo);

            }
        }else{
            System.out.println("El titulo no esta disponible");
        }
      }
    }

import Clases.Clientes;
import Clases.VideoStore;

import java.time.LocalDateTime;
import java.util.ArrayList;
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



    }

        public void mostradoClientes(ArrayList<Clientes> lista){
            for(Clientes c : lista){
                System.out.println(c.toString());
            }
        }


}
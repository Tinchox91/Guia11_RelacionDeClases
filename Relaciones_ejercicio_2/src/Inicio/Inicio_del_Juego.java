

package Inicio;

import Servicios_y_Entidades.Juego;
import Servicios_y_Entidades.Jugador;
import Servicios_y_Entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;





public class Inicio_del_Juego {

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList <Jugador> jugadores = new ArrayList<>();
        System.out.println("Ingrese la cantidad de jugadores (MAXIMO 6)");
        int cant = leer.nextInt();
        if (cant > 1 || cant < 6){
            cant = 6;
        }
        
        for (int i = 0; i < cant; i++) {
           Jugador jugador = new Jugador(i);
            jugadores.add(jugador);
            
        }
        Revolver rev = new Revolver();
        Juego play = new Juego();
        rev.llenar();
        play.llenarJuego(jugadores, rev);
        play.ronda();
        
    }
    
}

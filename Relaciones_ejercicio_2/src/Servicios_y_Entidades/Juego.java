
package Servicios_y_Entidades;

import java.util.ArrayList;

public class Juego {
    private Revolver revolver;
    private ArrayList <Jugador> jugadores;
    
    public void llenarJuego(ArrayList<Jugador>jugadoress, Revolver r){
        revolver= r;
        jugadores= new ArrayList<>(jugadoress);
    }
    public void ronda(){
        revolver.llenar();

        for (Jugador jugador : jugadores) {
            if (jugador.disparo(revolver)) {
                System.out.println(jugador + " ¡Ha sido mojado!");
                break;
            } else {
                System.out.println(jugador + " esta a salvo.");
            }
        }
    }
    }
    



package Entidades;

import java.util.ArrayList;
import java.util.Collections;


public class Baraja {
    private ArrayList <Carta> cartas;
   private ArrayList <Carta> resto;

    public Baraja() {
        cartas= new ArrayList<>();
        resto =new ArrayList<>();
        inicializarBaraja();
    }
    
    public void inicializarBaraja(){
        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};
        for (String aux : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    Carta carta = new Carta(numero, aux);
                    cartas.add(carta);
                }
            }
        }
    }
   
   public void barajar() {
        Collections.shuffle(cartas);
    }
    public Carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }

        Carta carta = cartas.remove(0);
        resto.add(carta);
        return carta;
    }
    
     public int cartasDisponibles() {
        return cartas.size();
    }
      public ArrayList<Carta> darCartas(int cantidad) {
        if (cantidad > cartas.size()) {
            System.out.println("No hay suficientes cartas disponibles.");
            return null;
        }

        ArrayList<Carta> cartasRepartidas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Carta carta = siguienteCarta();
            cartasRepartidas.add(carta);
        }

        return cartasRepartidas;
    }
     public void cartasMonton() {
        if (resto.isEmpty()) {
            System.out.println("Aún no se ha sacado ninguna carta.");
            return;
        }

        System.out.println("Cartas en el montón:");
        for (Carta aux : resto) {
            System.out.println(aux);
        }
    }
     
     public void mostrarBaraja() {
        if (cartas.isEmpty()) {
            System.out.println("La baraja está vacía.");
            return;
        }

        System.out.println("Cartas en la baraja:");
        for (Carta aux : cartas) {
            System.out.println(aux);
        }
    }
}
    


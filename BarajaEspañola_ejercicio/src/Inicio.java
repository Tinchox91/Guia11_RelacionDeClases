
import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.Scanner;


public class Inicio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Baraja baraja = new Baraja();
        baraja.barajar();

        Carta carta1 = baraja.siguienteCarta();
        System.out.println("Carta sacada: " + carta1);

        ArrayList<Carta> cartasRepartidas = baraja.darCartas(5);
        System.out.println("Cartas repartidas:");
        for (Carta carta : cartasRepartidas) {
            System.out.println(carta);
        }

        baraja.cartasMonton();

        baraja.mostrarBaraja();
    }
       
    }
    



package Servicios_y_Entidades;


public class Jugador {
    
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador "+(id+1);
        this.mojado = false;
    }
    
    public boolean disparo(Revolver r){
       
       r.siguienteChorro();
       if (r.mojar()){
           mojado= true;
           return true;
       }else return false;
       
       
    }
    public String toString() {
        return nombre + (mojado ? " esta mojado" : " no esta mojado");
    }
    
    
}

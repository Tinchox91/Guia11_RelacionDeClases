
package Servicios_y_Entidades;

public class Revolver {
    
    private int posicion_tambor ;
    private int posicion_agua;

    public Revolver() {
    }

    public Revolver(int posicion_tambor, int posicion_agua) {
        this.posicion_tambor = posicion_tambor;
        this.posicion_agua = posicion_agua;
    }

    public int getPosicion_tambor() {
        return posicion_tambor;
    }

    public void setPosicion_tambor(int posicion_tambor) {
        this.posicion_tambor = posicion_tambor;
    }

    public int getPosicion_agua() {
        return posicion_agua;
    }

    public void setPosicion_agua(int posicion_agua) {
        this.posicion_agua = posicion_agua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicion_tambor=" + posicion_tambor + ", posicion_agua=" + posicion_agua + '}';
    }
    
    public void llenar(){
        posicion_tambor= (int) (Math.random() * 6) + 1;
        posicion_agua = (int) (Math.random() * 6) + 1;
    }
     public boolean  mojar () {
         boolean val;
         int val1=posicion_tambor;
         int val2= posicion_agua;
         if(val2==val1){
             val = true;
         }else val=false;
         return val;
     }
     public void siguienteChorro(){
         posicion_tambor =posicion_tambor + 1;
     }
     
     public void mostrar(){
      toString();   
     }
            
}

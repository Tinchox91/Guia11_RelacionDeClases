
package Servicios;

import Entidades.Persona;
import java.util.Scanner;


public class Persona_Serv {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   public Persona crearPersona(){
       
       System.out.println("Ingrese nombre");
       String nombre= leer.next();
       System.out.println("Ingrese apellido");
       String apellido = leer.next();
       System.out.println("Ingrese edad");
       int edad = leer.nextInt();
       System.out.println("Ingrese DNI:");
       long dni= leer.nextLong();
       
       return new Persona(nombre,apellido,edad,dni,null);
   }
           
   
    
}

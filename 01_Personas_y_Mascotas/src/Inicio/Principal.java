
package Inicio;

import Entidades.Perro;
import Entidades.Persona;
import Servicios.Perro_Serv;
import Servicios.Persona_Serv;
import java.util.Scanner;


public class Principal {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona_Serv pserv = new Persona_Serv();
        Perro_Serv perroserv = new Perro_Serv();
        System.out.println("Primer perona: ");
        Persona persona1 = new Persona();
        persona1 = pserv.crearPersona();
        System.out.println("--------------------------------");
        System.out.println("Segunda Persona:");
        Persona persona2 = new Persona();
        persona2=pserv.crearPersona();
        System.out.println("---------------------------------");
        System.out.println("Ingresando Primer Perro:");
        Perro perro1 = new Perro();
        perro1= perroserv.crearPerro();
        System.out.println("-------------------------------");
         System.out.println("Ingresando Segundo Perro:");
        Perro perro2 = new Perro();
        perro2= perroserv.crearPerro();
        System.out.println("-------------------------------");
       persona1.setPerro(perro1);
       persona2.setPerro(perro2);
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        
        
      
    }
    
}

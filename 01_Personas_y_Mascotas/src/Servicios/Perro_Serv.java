
package Servicios;

import Entidades.Perro;
import java.util.Scanner;
/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
*/
public class Perro_Serv {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Perro crearPerro(){
        System.out.println("Ingrese el nombre:");
        String nombre = leer.next();
        System.out.println("Ingrese Raza:");
        String raza= leer.next();
        System.out.println("Ingrese edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese Tamaño:");
        String tamanio= leer.next();
       return new Perro(nombre,raza,edad,tamanio); 
    }
    
}

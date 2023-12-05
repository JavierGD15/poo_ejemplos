package herencia;

// Creamos una clase Animal que servirá como clase padre o superclase

import java.awt.Color;
import javax.swing.JFrame;

class Animal {

    int edad;
    int estatura;
    

    public void comer() {
        System.out.println("El animal está comiendo");
    }
}

// Creamos una subclase Perro que hereda de la clase Animal
class Perro extends Animal {

    String raza;

    public Perro(String raza) {
        this.raza = raza;
    }
    
    

    public void mostrar_edad() {
    }
}

// En el programa principal podemos utilizar las clases Animal y Perro
public class Main {

    public static void main(String[] args) {
        Animal miAnimal = new Animal(); // Creamos un objeto Animal
        

        miAnimal.comer();
        
    }
}

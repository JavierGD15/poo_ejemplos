package abstraccion;

// Creamos una subclase concreta Coche
class Coche extends Vehiculo {

    @Override
    public void acelerar() {
        velocidad = 70;
        System.out.println("La velocidad es: " + velocidad);
    }

    @Override
    public void encender() {
        System.out.println("El carro enciende");
    }

}

// Creamos otra subclase concreta Moto
class Moto extends Vehiculo {

    @Override
    public void acelerar() { // Implementamos el método abstracto
        velocidad += 20; // Aceleramos la moto en 20 km/h
    }

    @Override
    public void encender() {
        System.out.println("La moto enciende");
    }
}

public class Main {

    public static void main(String[] args) {
        Vehiculo miCoche = new Coche(); 
        Vehiculo miMoto = new Moto();
        
        miCoche.acelerar(); 
        miMoto.acelerar(); 

        System.out.println("Velocidad del coche: " + miCoche.velocidad);
        System.out.println("Velocidad de la moto: " + miMoto.velocidad);
    }
}

package encapsulamiento;

class Coche {

    private String marca; 
    private String modelo; 
    private int velocidad; 

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    

    public void acelerar() { // Método público para acelerar el coche
        velocidad += 10;
    }
}

// En el programa principal podemos utilizar la clase Coche sin tener acceso directo a sus atributos privados
public class Main {

    public static void main(String[] args) {
        
        Coche miCoche = new Coche(); // Creamos un objeto Coche

        miCoche.setMarca("Ford"); // Establecemos la marca a través del método público
        miCoche.setModelo("Mustang"); // Establecemos el modelo a través del método público
        miCoche.acelerar(); // Aceleramos el coche a través del método público

        System.out.println("Marca: " + miCoche.getMarca()); // Obtenemos la marca a través del método público
        System.out.println("Modelo: " + miCoche.getModelo()); // Obtenemos el modelo a través del método público
        System.out.println("Velocidad: " + miCoche.getVelocidad()); // Obtenemos la velocidad a través del método público
    }
}

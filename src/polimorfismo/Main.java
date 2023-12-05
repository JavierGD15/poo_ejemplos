package polimorfismo;

// Creamos una superclase llamada Figura
abstract class Figura {

    abstract double area();

    abstract double perimetro();
}

// Creamos dos subclases que heredan de la clase Figura
class Rectangulo extends Figura {

    double largo;
    double ancho;

    Rectangulo(double largo, double ancho) {

        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    double area() {
        return largo * ancho;
    }

    @Override
    double perimetro() {
        return 2 * largo + 2 * ancho;
    }
}

class Circulo extends Figura {

    double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double area() {
        return Math.PI * radio * radio;
    }

    @Override
    double perimetro() {
        return 2*Math.PI*radio;
    }
}

// En el programa principal podemos utilizar las clases Figura, Rectangulo y Circulo
public class Main {

    public static void main(String[] args) {
        Figura miFigura;

        miFigura = new Rectangulo(10, 20);
        System.out.println("El área del rectángulo es: " + miFigura.area());
        System.out.println("El perimetro es: " + miFigura.perimetro());

        miFigura = new Circulo(5);
        System.out.println("El área del círculo es: " + miFigura.area());
        System.out.println("El perimetro es: " + miFigura.perimetro());

    }
}

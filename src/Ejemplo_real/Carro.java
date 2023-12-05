package Ejemplo_real;



public class Carro {

    private int placa;
    private String marca;
    private String llantas;
    private String modelo;
    private String color;
    private int year;
    
    
    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    

    
    private void encender() {
        System.out.println("El carro se enciende");

    }

    public String calentar(int temperatura) {

        if (temperatura < 70) {
            System.out.println("Todo bien");
            return "todo bien";
        } else {
            return "explota";
        }

    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
    }
}

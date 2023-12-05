package ejemploNuevo;

public class Carro {
    
    private String modelo;
    private String marca;
    private int velocidad;
    private String tipo;
    private String color;

    public Carro(String modelo, String marca, int velocidad, String tipo, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidad = velocidad;
        this.tipo = tipo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}

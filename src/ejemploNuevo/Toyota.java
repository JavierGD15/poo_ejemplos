/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploNuevo;


public class Toyota  extends Carro{
    
    private String aniosGarantia;
    private String nombreLogo;

    public Toyota(String aniosGarantia, String nombreLogo, String modelo, String marca, int velocidad, String tipo, String color) {
        super(modelo, marca, velocidad, tipo, color);
        this.aniosGarantia = aniosGarantia;
        this.nombreLogo = nombreLogo;
    }
    
    public void imprimir(){
    
        System.out.println(this.getMarca());
    }
    
}

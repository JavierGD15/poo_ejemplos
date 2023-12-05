/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploNuevo;


public class main {
    public static void main(String[] args) {
        Carro carrito = new Carro("Mazda 3", "Mazda", 150, "Hashback", "Corinto");
        System.out.println("Su marca es: "+ carrito.getMarca());
        
        Toyota carro2 = new Toyota("15", "nombre","Mazda 3", "Mazda", 150, "Hashback", "Corinto");
    }
}

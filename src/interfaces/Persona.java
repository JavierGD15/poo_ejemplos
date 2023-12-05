/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

public class Persona implements Saludador, Accion {

    @Override
    public void saludar() {
    }

    @Override
    public void correr() {
        System.out.println("Empieza a correr");
    }

    @Override
    public void saltar() {
        System.out.println("Salta 5 cm");
    }

    @Override
    public void jugar() {
        System.out.println("Juega LOL");
    }

}

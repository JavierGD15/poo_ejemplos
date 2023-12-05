package Ejemplo_real;

public class Cuenta {

    int saldo;

    public Cuenta(int saldo) {
        this.saldo = saldo;
    }

    public void abonar(int saldo) {

        this.saldo += saldo;
    }

    public void debitar(int saldo) {

        this.saldo -= saldo;
    }

    public int mostrar() {

        return this.saldo;
    }
}

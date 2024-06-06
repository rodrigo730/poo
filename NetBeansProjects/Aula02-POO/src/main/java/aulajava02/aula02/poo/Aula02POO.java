

package aulajava02.aula02.poo;

public class Aula02POO {

    public static void main(String[] args) {
        Caneta c1 = new Caneta ();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
        c1.status();
        c1.tampada();
        c1.rabiscar();
    }
}

package aulajava02.exercicio.poo.aula02;
public class ExercicioPOOAula02 {

    public static void main(String[] args) {
        Garrafa c1 = new Garrafa ();
        Celular c2 = new Celular ();
        
        c2.ligado = true;
        c2.marca = "samsung";
        
        c2.status();
        
        c1.tamanho = 40;
        c1.cor = "azul";
        c1.marca = "Growth";
        c1.ml = 1.5f;
        c1.cheia = false;
        c1.tampada= true;
        c1.derramar();
        c1.cheia();
    }
}

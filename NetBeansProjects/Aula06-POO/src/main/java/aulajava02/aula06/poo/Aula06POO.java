
package aulajava02.aula06.poo;

public class Aula06POO {
    public static void main(String[] args) {
 
       ControleRemoto c = new ControleRemoto();
         c.setVolume(100);
         c.setTocando(true);
         c.setLigado(true);
         c.ligarMudo();
         c.abrirMenu();
        
     }
}

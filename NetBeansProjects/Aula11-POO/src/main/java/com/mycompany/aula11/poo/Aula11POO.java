
package com.mycompany.aula11.poo;
public class Aula11POO {

    public static void main(String[] args) {
       Bolsista b1 = new Bolsista();
       Aluno a1 = new Aluno();
       a1.setIdade(22);
       a1.setNome("Rodiney");
       a1.setSexo("m");
       a1.pagarMensalidade();
       
       
       b1.setNome("Cleitin");
        b1.pagarMensalidade();
        b1.setBolsa(16f);
        b1.setIdade(20);
        b1.setSexo("M");
       System.out.println(b1.toString());
    }
}

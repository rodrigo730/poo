
package com.mycompany.aula11.poo;
public class Aula11POO {

    public static void main(String[] args) {
       Bolsista b1 = new Bolsista();
       Aluno a1 = new Aluno();
       Professor p1 = new Professor();
       Tecnico t1 = new Tecnico();
       a1.setIdade(22);
       a1.setNome("Rodiney");
       a1.setSexo("m");
       a1.pagarMensalidade();
       
       b1.setNome("Cleitin");
        b1.setBolsa(16f);
        b1.setIdade(20);
        b1.setSexo("M");
        b1.pagarMensalidade();
       System.out.println(b1.toString());
       
       p1.setNome("Altair");
       p1.setIdade(52);
       p1.setSexo("M");
       p1.setEspecialidade("Professor de Ciências");
       p1.setSalario(1550.89f);
       p1.receberAum();
       System.out.println(p1.toString());
       
       t1.setNome("Guilherme");
       t1.setIdade(25);
       t1.setSexo("M");
       t1.setCurso("Analise e Desenvolvimento de Sistemas");
       t1.setregisProfissional(2454337.26363f);
       t1.setMatr(2452553);
       t1.praticar();
    }
}

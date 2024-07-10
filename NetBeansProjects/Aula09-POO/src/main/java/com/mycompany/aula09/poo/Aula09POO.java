
package com.mycompany.aula09.poo;
public class Aula09POO {

    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[3];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Maria", 20, "Feminino");
        p[1] = new Pessoa("Luana", 19, "Feminino");
        p[2] = new Pessoa("Vinicius", 25, "Masculino");
        
        l[0] = new Livro("O poder do Habito", "Charles Duhigg", 408, p[2],0, false);
        l[1] = new Livro("Estrutura de dados", "Ezio", 408, p[0],0, false);
        l[2] = new Livro("Aprendendo Java", "Desconhecido",279, p[1],0, false);
        
        
        System.out.println(l[2].detalhes());
    }
}

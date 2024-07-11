
package com.mycompany.aula11.poo;

public abstract class Pessoa {
    String nome;
    private int idade;
    private String sexo;
    
    public void fazerAniv(){
        this.setIdade(getIdade() + 1);
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String s){
        this.sexo = s;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", "
                + "idade=" + idade + ", "
                + "      sexo=" + sexo + '}';
    }
    
}

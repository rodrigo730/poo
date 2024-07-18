package com.mycompany.aula15.poo;
public class Pessoa {
    private String sexo;
    private int idade; 
    private String nome;
    private int xp;
    
    public String getSexo(){
        return sexo;
    }
    public void setSexo(){
        this.getSexo();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
    
    public void ganharxp(){
        
    }
}

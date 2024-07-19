package com.mycompany.aula15.poo;
public abstract class Pessoa {
    protected String sexo;
    protected int idade; 
    protected String nome;
    protected int xp;

    public Pessoa(String sexo, int idade, String nome) {
        this.sexo = sexo;
        this.idade = idade;
        this.nome = nome;
        this.xp = 0;
    }
    
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

    @Override
    public String toString() {
        return "\nPessoa{" + "\nsexo=" + sexo + 
                ",\nidade=" + idade + 
                ",\nnome=" + nome + ", "
                + "\nxp=" + xp + '}';
    }
    
}

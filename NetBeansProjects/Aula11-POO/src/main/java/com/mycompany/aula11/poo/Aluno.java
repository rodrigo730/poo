package com.mycompany.aula11.poo;
public class Aluno extends Pessoa {
    private int matr;
    private String curso;
    
    public final void pagarMensalidade(){
        System.out.println("O aluno está pagando a mensalidade");
    }
    
    public int getMatr(){
        return matr;
    }
    public void setMatr(int m){
        this.matr = m;
    }
    public String getCurso(){
        return curso;
    }
    public void setCurso(String c){
        this.curso = c;
    }
}

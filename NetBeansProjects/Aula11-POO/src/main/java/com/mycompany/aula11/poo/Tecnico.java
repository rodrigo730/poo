package com.mycompany.aula11.poo;
public class Tecnico extends Aluno{
    private float regisProfissional;
    
    public void praticar(){
        System.out.println("O Aluno esta praticando");
    }
    public float getregisProfissional(){
        return regisProfissional;
    }
    public void setregisProfissional(float p){
        this.regisProfissional = p;
    }

    
   
}

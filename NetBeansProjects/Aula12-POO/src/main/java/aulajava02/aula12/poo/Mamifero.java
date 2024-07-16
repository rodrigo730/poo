package aulajava02.aula12.poo;
public class Mamifero extends Animal{
    private String corPelo;
    
    public String getcorPelo(){
        return corPelo;
    }
    public void setcorPelo(String p){
        this.corPelo = p;
    }
    
    @Override
    public void locomover(){
        System.out.println("Correndo");
    }
    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de Mamifero");
    }
    
}

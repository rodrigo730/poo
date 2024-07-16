package aulajava02.aula12.poo;
public class Reptil extends Animal{
    private String cordaEscama;
    
    public String getcordaEscama(){
        return cordaEscama;
    }
    public void setcordaEscama(String e){
        this.cordaEscama = e;
    }
    
    @Override
    public void locomover(){
     System.out.println("Rastejando");   
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo Vegetal");
    }
    @Override
    public void emitirSom(){
        System.out.println("Emitir som de Reptil");
    }
    
}


package aulajava02.aula12.poo;

public class Ave extends Animal{
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    public void fazerninho(){
        System.out.println("Fazendo Ninho");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    
 
}

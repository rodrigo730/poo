
package aulajava02.aula12.poo;
public class Peixe extends Animal{
    private String corPeixe;

    public String getCorPeixe() {
        return corPeixe;
    }

    public void setCorPeixe(String c) {
        this.corPeixe = c;
    }
    public void soltarBolha(){
        System.out.println("Soltando bolhas");
    }
   
     @Override
    public void locomover(){
     System.out.println("Nadando");   
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo Ração");
    }
    @Override
    public void emitirSom(){
        System.out.println("Peixes não solt");
    }
    
}

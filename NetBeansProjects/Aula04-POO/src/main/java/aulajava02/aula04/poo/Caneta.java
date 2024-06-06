
package aulajava02.aula04.poo;

public class Caneta {
    private boolean tampar;
    public String modelo;
    private String cor;
    private float ponta; 

    public Caneta(String m, String c, float p){ //este é metedo construtor
        
        this.setmodelo(m);
        this.setcor(c);
        this.setponta(p);
        this.tampar();
    }
    
    public String getmodelo(){
        return this.modelo;
    }
    public void setmodelo(String m){
        this.modelo = m;
    }
    public float getponta(){
        return this.ponta;
    }
    public void setponta(float p){
        this.ponta = p;
    }
    public boolean gettampar(){
        return this.tampar;
    } 
    public void settampar(boolean t){
        this.tampar = t;
    }
    public String getcor(){
        return this.cor;
    }
    public void setcor(String c){
        this.cor = c;
    }
    public void status(){
        System.out.println("Sobre A caneta:");
        System.out.println("Ponta da caneta " + this.getmodelo());
        System.out.println("O modelo e " + this.getponta());
        System.out.println("A Caneta esta " + this.gettampar());
        System.out.println("Acor da caneta e " + this.getcor());
    }
    public void tampar(){
        this.tampar = true;
}
    public void destampar(){
        this.tampar = false;
    }
    }
    

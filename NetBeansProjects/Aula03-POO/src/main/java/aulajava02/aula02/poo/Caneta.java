package aulajava02.aula02.poo;
public class Caneta {
    public String modelo;
    public String cor;
    private Float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
       System.out.println("Modelo: " + this.modelo);
       System.out.println("Ponta: " + this.ponta);
       System.out.println("Uma caneta " + this.cor);
       System.out.println("Esta Tampada " + this.tampada);
       System.out.println("Carga: " + this.carga);
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Estou Rabiscando");
        }else{
            System.out.println("Nao estou rabiscando");
        }
    }
    public  void tampada(){
        this.tampada = true;
    }
    public void destampada(){
        this.tampada = false;
    }
}

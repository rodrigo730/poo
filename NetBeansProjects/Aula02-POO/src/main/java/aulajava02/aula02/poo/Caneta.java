package aulajava02.aula02.poo;
public class Caneta {
    String modelo;
    String cor;
    Float ponta;
    int carga;
    boolean tampada;
    
    void status(){
       System.out.println("Modelo: " + this.modelo);
       System.out.println("Ponta: " + this.ponta);
       System.out.println("Uma caneta " + this.cor);
       System.out.println("Esta Tampada " + this.tampada);
       System.out.println("Carga: " + this.carga);
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Estou Rabiscando");
        }else{
            System.out.println("Nao estou rabiscando");
        }
    }
    void tampada(){
        this.tampada = true;
    }
    void destampada(){
        this.tampada = false;
    }
}


package aulajava02.exercicio.poo.aula02;
public class Garrafa {
    int  tamanho;
    String  cor;
    String marca;
    float ml;
    boolean cheia;
    boolean tampada;
    boolean destampada;
    
    void status(){
        System.out.println("O tamanho da garrafa e de "+ this.tamanho + "cm");
        System.out.println("A cor da garrafa e " + this.cor);
        System.out.println("A garrafa e da " + this.marca);
        System.out.println("A tem  " + this.ml);
        System.out.println("A garrafa esta tampada?" + this.tampada);
        System.out.println("A garrafa esta tampada" + this.tampada);
    }
    void cheia(){
        if(this.cheia== true){
            System.out.println("A Garrafa esta cheia");
        }else{
            System.out.println("A Garrafa esta vazia");
        }
    }
    void vazia(){
        this.cheia = false;
    }
    void tampada(){
        if(this.tampada == true){
            System.out.println("A garrafa esta tampada" + this.tampada);
        }else{
            System.out.println("A garrafa esta destampada");
        }
            
    }
    void destampada(){
    this.tampada = false;
}
    void derramar(){
        if(this.tampada == true){
            System.out.println("A garrafa transbordou !!");
        }else{
            System.out.println("A garrafa nao transbordou");
        }
    }
    
}

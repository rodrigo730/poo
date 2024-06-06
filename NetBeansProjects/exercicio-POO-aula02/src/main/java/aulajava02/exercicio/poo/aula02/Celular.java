
package aulajava02.exercicio.poo.aula02;

public class Celular {

    float tamanho;
    int tbateria; 
    String tela;
    String marca;
    boolean quebrado;
    boolean ligado;
    
    void status(){
        System.out.println("O Tamanho do telefone é de" + this.tamanho);
        System.out.println("O Tamanho da bateria e de" + this.tbateria);
        System.out.println("A Tela de qual tipo?" + this.tela);
        System.out.println("Qual a marca?" + this.marca);
        System.out.println("O telefone esta quebrado?" + this.quebrado);
        System.out.println("Ele esta desligado ou ligado?" + this.ligado);
        
    }
    void ligado(){
        if(this.ligado == true){
            System.out.println("O telefone esta ligado, agora e usar");
        }else if(this.ligado == false){
         System.out.println("O telefone esta desligado, aperte o botao para ligar");
        }else{
            System.out.println("O Celular esta sem bateria");
        }
    }
    
}

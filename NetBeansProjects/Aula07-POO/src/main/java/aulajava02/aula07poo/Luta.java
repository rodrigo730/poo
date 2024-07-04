
package aulajava02.aula07poo;

import java.util.Random;


public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds; 
    private boolean aprovado;
    
    public void marcarLuta(Lutador l0, Lutador l1 ){
        if(l0.getCategoria().equals(l1.getCategoria()) &&  l0 != l1){
            this.setAprovado(true);
            this.desafiado = l0;
            this.desafiante = l1;
        }else{
            this.setAprovado(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        
        if (this.aprovado == true){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
           Random aleatorio =  new Random();
           int vencedor = aleatorio.nextInt(3);
           switch(vencedor) {
               case 0:
                   System.out.println("Empatou");
                   this.desafiado.empatarluta();
                   this.desafiante.empatarluta();
                   break;
               case 1:
                   System.out.println("O Desafiado Ganhou a Luta!!");
                   this.desafiado.ganhaLuta();
                   this.desafiante.perderluta();
                   break;
               case 2:
                   System.out.println("O Desafiante Ganhou a Luta!!");
                   this.desafiado.perderluta();
                   this.desafiante.ganhaLuta();
                   break;
           }
        }else{
            System.out.println("A luta não pode acontecer!!!");
        }
    }
    public int getRounds(){
        return rounds;
    }
    public void setRounds(int r){
       this.rounds = r;
    }
    public boolean getAprovado(){
        return aprovado;
    }
    public void setAprovado(boolean a){
        this.aprovado = a;
    } 
    public Lutador getDesafiado(){
        return desafiado;
    }
    public void setDesafiado(Lutador d){
         this.desafiado = d;
    }
    public Lutador getDesafiante(){
        return desafiante;
    }
    public void setDesafiante(Lutador dd){
        this.desafiante = dd;
    }
}

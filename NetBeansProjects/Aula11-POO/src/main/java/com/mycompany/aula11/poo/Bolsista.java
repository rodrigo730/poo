
package com.mycompany.aula11.poo;
public class Bolsista extends Pessoa{
    private float bolsa; 
    
    
     public void pagarMensalidade(){
        System.out.println( "O Aluno, " + this.nome + " Realizou Pagamento e é Bolsista "+ " tem Desconto no Pagamento\n");
    }
    public void renovarBolsa(){
        System.out.println("O aluno Renovou a bolsa");
    }
     public float getBolsa(){
        return bolsa;
    }
    public void setBolsa(float b){
        this.bolsa = b;
    }
}

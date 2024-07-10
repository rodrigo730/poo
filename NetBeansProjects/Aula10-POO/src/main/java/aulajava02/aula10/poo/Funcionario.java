
package aulajava02.aula10.poo;

public class Funcionario extends Pessoa{
    private String setor;
    private Boolean trabalhando;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String s) {
        this.setor = s;
    }

    public Boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(Boolean t) {
        this.trabalhando = t;
    }
    
    
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }
}

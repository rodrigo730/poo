
package aulajava02.aula12.poo;
public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float p) {
        this.peso = p;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int m) {
        this.membros = m;
    }

    @Override
    public String toString() {
        return "Animal{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + '}';
    }
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
   
        
}

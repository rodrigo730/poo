
package com.mycompany.aula11.poo;
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    public void receberAum(){
        System.out.println("O professor " + this.getNome() + " recebeu um aumento");
        this.setSalario(getSalario() + 1000);
        
    }
    public String getEspecialidade(){
        return especialidade;
    }
    public void setEspecialidade(String e){
        this.especialidade = e;
    }
    public float getSalario(){
        return salario;
    }
    public void setSalario(float s){
        this.salario = s;
    }

    @Override
    public String toString() {
        return "Professor{" + "\nespecialidade=" + especialidade + ",\n salario=" + salario + '}';
    }
    
}

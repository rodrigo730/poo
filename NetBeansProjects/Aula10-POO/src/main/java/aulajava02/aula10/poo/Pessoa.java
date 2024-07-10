package aulajava02.aula10.poo;

public class Pessoa {
 private int idade;    
 private String sexo;
 private String nome;

 
 public void fazerAniv(){
     this.setIdade(this.getIdade() + 1);
 }
 
  public int getIdade(){
      return idade;
  } 
  public void setIdade(int i){
      this.idade = i;
  }
  public String getSexo(){
      return sexo;
  }
  public void setSexo(String s){
      this.sexo = s;
  }
  public String getNome(){
      return nome;
  }
  public void setNome(String n){
      this.nome = n;
  }

    @Override
    public String toString() {
        return "Pessoa{" + "idade=" + idade + ", sexo=" + sexo + ", nome=" + nome + '}';
    }
  
}

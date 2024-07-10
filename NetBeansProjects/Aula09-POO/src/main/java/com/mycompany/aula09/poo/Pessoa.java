package com.mycompany.aula09.poo;

public class Pessoa {
 private String pessoa;
 private int idade; 
 private String sexo;
 
 public Pessoa(String p, int i, String s){
     this.pessoa = p;
     this.idade = i;
     this.sexo = s;
 }
 
 public String getPessoa(){
     return pessoa;
 }
 public void setPessoa(String p){
     this.pessoa = p;
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
 
 public void fazeraniv(){
     setIdade(getIdade() + 1);
 }
}

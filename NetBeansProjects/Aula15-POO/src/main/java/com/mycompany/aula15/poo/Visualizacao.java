package com.mycompany.aula15.poo;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme; 
        this.espectador.setTotAssis(this.espectador.getTotAssis() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
   
    
    public Gafanhoto getEspectador(){
        return espectador;
    }
    public void setEspectedor(Gafanhoto e){
        this.espectador = e;
    }
    public Video getFilme(){
        return filme;
    }
    public void setFilme(Video f){
        this.filme = f;
    }
    
    public void Avaliar(){
        this.filme.setAvaliaçao(5);
    }
    public void Avaliar(int nota){
        this.filme.setAvaliaçao(nota);
    }
    public void Avaliar(float porc){
        int tot = 0;
        if(tot <= 20){
            tot = 3;
        }else if(tot > 20 || tot <=50){
            tot = 5;
        }else if(tot > 50 || tot <=90){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliaçao(tot);
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
}

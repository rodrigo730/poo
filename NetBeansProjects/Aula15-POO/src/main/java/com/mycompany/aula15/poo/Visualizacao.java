package com.mycompany.aula15.poo;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme; 
        this.espectador.setTotAssis(this.espectador.getTotAssis() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
        this.filme.setCurtidas(this.filme.getCurtidas() + 1);
        this.filme.setDislike(this.filme.getDislike() + 1);
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
        
    }
    public void Avaliar(float nota){
        
    }
    public void Avaliar(int porc){
        
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
}

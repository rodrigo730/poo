package com.mycompany.aula15.poo;
public class Video implements AcoesVideo{
    
    private String Titulo;
    private int avaliaçao;
    private int views;
    private int curtidas;
    private int dislike;
    private boolean reproduzindo;
    private boolean inscrito;

    public Video(String Titulo) {
        this.Titulo = Titulo;
        this.avaliaçao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = true;
        
    }
    
    public boolean getInscrito(){
        return inscrito;
    }
    public void setInscrito(boolean i){
        this.inscrito = i;
    }
    
    public int getDislike(){
        return dislike;
    }
    public void setDislike(int d){
        this.dislike = d;
    }
    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String T) {
        this.Titulo = T;
    }

    public int getAvaliaçao() {
        return avaliaçao;
    }

    public void setAvaliaçao(int a) {
        this.avaliaçao = a;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int v) {
        this.views = v;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int c) {
        this.curtidas = c;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean r) {
        this.reproduzindo = r;
    }
    
    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    @Override
    public void dislike() {
        this.setDislike(this.getDislike() +1);
    }
    @Override 
    public void inscrever(){
       this.setInscrito(true);
    }
 
     @Override
    public void desinscrever() {
         this.setInscrito(false);
    }

    @Override
    public String toString() {
        return "Video{" + "Titulo=" + Titulo + 
                ", \navalia\u00e7ao=" + avaliaçao + 
                ", \nviews=" + views + 
                ", \ncurtidas=" + curtidas + 
                ", \ndislike=" + dislike + 
                ", \nreproduzindo=" + reproduzindo + 
                ", \ninscrito=" + inscrito + '}';
    }

   

 

   

   
    
    
}

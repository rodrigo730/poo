package com.mycompany.aula15.poo;
public class Video implements AcoesVideo{
    
    private String Titulo;
    private int avaliaçao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String Titulo) {
        this.Titulo = Titulo;
        this.avaliaçao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = true;
        
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

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean r) {
        this.reproduzindo = r;
    }
    
    
    
    @Override
    public void play() {
        
    }

    @Override
    public void pause() {
    }

    @Override
    public void like() {
    }

    @Override
    public void dislike() {
    }

    @Override
    public String toString() {
        return "Video{" + "Titulo=" + Titulo + ", avalia\u00e7ao=" + avaliaçao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
}

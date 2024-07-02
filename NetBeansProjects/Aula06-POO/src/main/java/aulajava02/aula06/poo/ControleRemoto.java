
package aulajava02.aula06.poo;
public final class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Metodo Construtor
    public ControleRemoto(){
       this.setVolume(50);
       this.setLigado(false);
       this.setTocando(false);
        
    }
    
    //Metodos Getters e Setters
    public int getVolume(){
        return this.volume;
    }
    public void setVolume(int v){
        this.volume= v;
    }
    public boolean getLigado(){
        return this.ligado;
    }
    public void setLigado(boolean l){
        this.ligado= l;
    }
    public boolean getTocando(){
        return this.tocando;
    }
    public void setTocando(boolean t){
        this.tocando= t;
    }
    //Metodos abstratos
    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
       System.out.println("Está Ligado?" + this.getLigado());
       System.out.println("Está tocando" + this.getTocando());
       System.out.print("Volume" + this.getVolume());
       for (int i = 0; i <= this.getVolume(); i +=10 ){
           System.out.print("|");
       }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() == true && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() == true && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() == true && this.getTocando() == false){
            this.setTocando(true);
        }
    }

    @Override
    public void pause(){
        if(this.getLigado() == true && this.getTocando() == true){
            this.setTocando(false);
        }
    }
    
}

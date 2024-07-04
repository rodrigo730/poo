
package aulajava02.aula07poo;

public class Aula07POO {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador ("Pretty Boy", 68.9f ,"França",31,1.71f,11,3,1);
        l[1] = new Lutador ("Putscript", 57.8f,"Brasil",29,1.68f,14,2,3);
        l[2] = new Lutador("Snapshadow",80.9f,"EUA",35,1.65f,12,2,1);
        l[3] = new Lutador("DeadCore", 81.6f,"Austrália",28,1.93f,13,0,2);
        l[4] = new Lutador("UFOCobol",119.3f,"brasil",37,1.70f,5,4,3);
        l[5] = new Lutador("Nerdaart",105.7f,"EUA",30,181f,12,2,4);
        
        
        Luta UEC01 = new Luta();
        
        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();
        l[4].status();
        l[5].status();
    } 
    
}

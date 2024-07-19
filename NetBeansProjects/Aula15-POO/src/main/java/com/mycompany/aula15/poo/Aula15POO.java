package com.mycompany.aula15.poo;
public class Aula15POO {

    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        v[0] = new Video("CursoPOO");
        v[1] = new Video("CursoC++");
        v[2] = new Video("CursoJavaScript");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Masculino", 12, "Cleiton", "Cleitin");
        g[1] = new Gafanhoto("Feminino", 80, "CLotilde", "Clotilde@ywy0");
      
        Visualizacao vis = new Visualizacao(g[0] , v[1]);
        vis.like();
        System.out.println(vis.toString());
        /*System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());*/
        //--------------------------------------
        //System.out.println(g[0].toString());
        //System.out.println(g[1].toString());
    }
    
    
}

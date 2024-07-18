package com.mycompany.aula15.poo;
public class Aula15POO {

    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        v[0] = new Video("CursoPOO");
        v[1] = new Video("CursoC++");
        v[2] = new Video("CursoJavaScript");
    
        System.out.println(v[0].toString());
    }
    
    
}

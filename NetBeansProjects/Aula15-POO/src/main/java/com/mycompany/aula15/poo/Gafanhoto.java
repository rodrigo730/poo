package com.mycompany.aula15.poo;
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssis;

    public Gafanhoto(String sexo, int idade, String nome,String l) {
        super(sexo, idade, nome);
        this.login = l;
        this.totAssis = 0;
    }
    
    
    public String isLogin() {
        return login;
    }

    public void setLogin(String l) {
        this.login = l;
    }

    public int getTotAssis() {
        return totAssis;
    }

    public void setTotAssis(int t) {
        this.totAssis = t;
    }
    
    public void watch(){
        this.setTotAssis(this.getTotAssis() + 1);
    }
}

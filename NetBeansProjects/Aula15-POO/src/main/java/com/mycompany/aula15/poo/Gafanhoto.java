package com.mycompany.aula15.poo;
public class Gafanhoto extends Pessoa{
    private boolean login;
    private int totAssis;

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean l) {
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

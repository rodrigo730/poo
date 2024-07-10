
package com.mycompany.aula09.poo;
public class Livro implements Publicacao{
  private String titulo;
  private String autor;
  private int totpaginas;
  private int pagAtual;
  private boolean aberto;
  private Pessoa leitor;

    public Livro(String ti, String a, int t, Pessoa l,int p, boolean ab) {
       setTitulo(ti);
       setAutor(a); 
       settotpaginas(t);
       setLeitor(l);
       setpagAtual(p);
       setAberto(false);
       
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String ti) {
        this.titulo = ti;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String a) {
        this.autor = a;
    }

    public int gettotpaginas() {
        return totpaginas;
    }

    public void settotpaginas(int t) {
        this.totpaginas = t;
    }

    public int getpagAtual() {
        return pagAtual;
    }

    public void setpagAtual(int p) {
        this.pagAtual = p;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean ab) {
        this.aberto = ab;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa l) {
        this.leitor = l;
    }

    public String detalhes() {
        return "Livro{" + " titulo=" + titulo + ",\n autor=" + autor + ","
                + "\n totpaginas=" + totpaginas + ", "
                + "\n pagAtual=" + pagAtual + ",\n aberto=" + aberto + ", "
                + "\n leitor=" + leitor.getPessoa() +
                 leitor.getIdade() +
                 leitor.getSexo() +
                '}';
    }
    

    @Override
    public void abrir() {
        if(getAberto() == false){
            setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if(getAberto() == true){
            setAberto(false);
        }
    }

    @Override
    public void folhear(int p) {
        setpagAtual(p);
    }

    @Override
    public void avancarPag() {
        setpagAtual(pagAtual + 1);
    }

    @Override
    public void voltaPag() {
        setpagAtual(pagAtual - 1);
    }

}

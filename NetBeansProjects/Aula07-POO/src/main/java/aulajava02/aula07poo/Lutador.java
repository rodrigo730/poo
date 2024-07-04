
package aulajava02.aula07poo;


public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float peso;
    private float altura;
    private String Categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    public Lutador(String no,float p, String n, int i, float a, int v, int d, int e){
        this.nome = no; 
        this.setPeso(p);
        this.nacionalidade = n;
        this.idade = i;
        this.altura = a;
        this.vitorias = v;
        this.derrotas = d;
        this.empates = e;
        
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float p) {
        this.peso = p;
        this.setCategoria();
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String no){
        this.nome = no;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public void setNacionalidade(String n){
        this.nacionalidade = n;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float a) {
        this.altura = a;
    }

    public String getCategoria() {
        return this.Categoria;
    }

    public void setCategoria() {
        if(this.peso < 52.2){
          this.Categoria = "Invalido";  
        }else if (this.peso <= 70.3){
            this.Categoria = "Leve";
        }else if(this.peso <= 83.9 ){
            this.Categoria = "Medio" ;
        }else if (this.peso <= 120.2){
            this.Categoria = "Pesado";
    }else {
            this.Categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int v) {
        this.vitorias = v;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int d) {
        this.derrotas = d;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int e) {
        this.empates = e;
    }
    
    public void apresentar(){
        System.out.println("--------------------------------");
        System.out.println("Lutador " + this.getNome());
        System.out.println("Origem " + this.getNacionalidade());
        System.out.println("Idade " + this.getIdade());
        System.out.println("Altura " + this.getAltura());
        System.out.println("Categoria " + this.getCategoria());
        System.out.println("Vitoria " + this.getVitorias());
        System.out.println("Empates " + this.getEmpates());
        System.out.println("Derrotas " + this.getDerrotas());
        System.out.println("--------------------------------");
    }
    public void status(){
        System.out.println("--------------------------------");
        System.out.println(this.getNome());
        System.out.println("Peso" + this.getCategoria());
        System.out.println(this.getVitorias() + "Vitorias");
        System.out.println(this.getDerrotas() + "Derrotas");
        System.out.println(this.getEmpates() + "Empates");
        System.out.println("--------------------------------");
    }
    public void ganhaLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderluta(){
       this.setDerrotas(this.getDerrotas() + 1 );
    }
    public void empatarluta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
}

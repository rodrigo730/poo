
package aulajava02.exerciciopoo.aula05;

public class Conta {

    public int nconta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void abrirconta(String t){
       setstatus(true);
       settipo(t);
       if( t == "cc"){
         this.setsaldo(50);
         System.out.println("O seu saldo e de: " + getsaldo());
       }else if(t == "cp"){
           this.setsaldo(150);
           System.out.println("O seu saldo e de: " + getsaldo());
       }
    }
    
    public void fecharconta(){
        
       
        if(this.getsaldo() > 0){
            System.out.println("A sua conta ainda tem saldo saqueo para fecha-la...");
        }else if (this.getsaldo() < 0){
            System.out.println("A sua conta ainda tem debito paguea para fechar-la" + "saldo..." + getstatus());
        }
        else{
            setstatus(false);
            System.out.println("Conta fechada");
        }
    }
    public void depositar(float v){
        if (this.getstatus()){
            this.setsaldo(this.getsaldo() + v);
            System.out.println("Deposito realizado com sucesso");
        }else{
            System.out.println("Impossivel depositar");
        }
    }           
   
    public void sacar(float v){
    if(getstatus()){
        if(saldo >= 1){
            setsaldo(getsaldo() - v);
        }
        else{
            System.out.println("A conta nao tem saldo");
        }                       
    }
    }
    public void pagarMensal(){
        int v = 0;
        if(tipo == "cc"){
            v = 12;
        }else if(tipo == "cp"){
            v =20;
        }if(status = true){
            if(saldo > v){
               setsaldo(getsaldo() - v); 
            }else{
                System.out.println("Impossivel pagar!!!");
            }
        }
                        
    }
   
    public Conta(){
    this.setstatus(false);
    this.setsaldo(0);
    }

    public int getNconta() {
        return nconta;
    }

    public void setNconta(int n) {
        this.nconta = n;
    }
     protected String gettipo() {
        return tipo;
    }

    public void settipo(String t) {
        this.tipo = t;
    }
    
    public String getdono(){
        return dono;
    }
    public void setdono(String d){
        this.dono = d;
    }
    public float getsaldo(){
        return saldo;
    }
    public void setsaldo(float s){
        this.saldo = s;
    }
    public boolean getstatus(){
        return status;
    }
    public void setstatus(boolean ss){
        this.status = ss;
    }
    
    public void status(){
        System.out.println("----------------");
        System.out.println("O numero da conta e: " + this.getNconta());
        System.out.println("O dono da conta e: " + this.getdono());
        System.out.println("O saldo da conta e de: " + this.getsaldo());
        System.out.println("O tipo da conta e " + this.gettipo());
        System.out.println("O estado da conta e: " + this.getstatus());
        System.out.println("----------------");
    }
}

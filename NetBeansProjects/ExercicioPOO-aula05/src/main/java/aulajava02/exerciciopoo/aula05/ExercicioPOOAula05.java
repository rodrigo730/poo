

package aulajava02.exerciciopoo.aula05;
public class ExercicioPOOAula05 {

    public static void main(String[] args) {
        
       Conta p1 = new Conta();
       p1.setNconta(111);
       p1.abrirconta("cc");
       p1.setdono("Cleitin");
       p1.getstatus();
       
       p1.status();
       
       Conta p2 = new Conta();
       p2.setNconta(222);
       p2.abrirconta("cp");
       p2.setdono("Clorispenis");
       p2.setsaldo(-200f);
       p2.getstatus();
       
       p2.status();
       p2.fecharconta();
       
    }
}

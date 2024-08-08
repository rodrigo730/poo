/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exrepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class Exrepita {

    public static void main(String[] args) {
        int n , s = 0;
        int m = 0;
        int i = 0;
        int p = -1;
        int ac = 0;
        int c = 1;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe um número <br> "
                                                        + "(OBS:Para interromper o laço clique no 0)<html>")); 
        s += n;
        c++;
        if(n%2==0){
        p++;
        }else{
          i++;  
        }if(n>100){
           ac++; 
        }
        }while(n != 0);
        m = s/c;
        JOptionPane.showMessageDialog(null, "Resultado:");
        JOptionPane.showMessageDialog(null, "<html><br>Total de Valores: " + s 
                + "<br>Total de Pares " + p 
                +"<br>Total de Impar " + i 
                + "<br>Total de Números Acima de 100: " + ac 
                + "<br>Media do Valores <html>" + m);
    }

        
    }


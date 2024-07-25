package com.mycompany.resolucaotela;
import java.awt.Toolkit;
import java.awt.Dimension;
public class ResolucaoTela {

    public static void main(String[] args) {
       Toolkit tk = Toolkit.getDefaultToolkit(); 
       Dimension d = tk.getScreenSize();
       
        System.out.println("A Resolução da tela é de: " + d.width + "x" + d.height);
    }
}

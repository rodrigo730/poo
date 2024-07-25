package com.mycompany.idiomadosistema;
import java.util.Locale;
public class IdiomadoSistema {

    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.print("O idioma do Sistema e: ");
        System.out.print(idioma.getDisplayLanguage());
    }
}

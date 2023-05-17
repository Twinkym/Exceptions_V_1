package NIVELL2;

import static NIVELL2.Entrada.*;

public class Main {
    public static void main(String[] args) {

        byte enter = Entrada.llegirByte("introdueix un enter: ");
        System.out.println("Enter introduit: " + enter);
        char caracter = Entrada.llegirChar("Introdueix un caràcter: ");
        System.out.println("Caràcter introduit: " + caracter);
        double decimal1 = llegirDouble("Introdueix un double: ");
        System.out.println("Double introduit: " + decimal1);
        float decimal2 = llegirFloat("Introdueix un float: ");
        System.out.println("Float introduit: " + decimal2);
        int enter2 = llegirInt("introdueix un enter: ");
        System.out.println("Enter introduit: " + enter2);
        String cadena = llegirString("Introdueix una cadena: ");
        System.out.println("Cadena introduida: " + cadena);
        boolean resposta = llegirSiNo("Introdueix 's' o 'n': ");
        System.out.println("Resposta introduida: " + resposta);
    }
}
package NIVELL2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    private static Scanner scanner = new Scanner(System.in);

    public static byte llegirByte(String missatge) {
        while(true){
            try {
                System.out.println(missatge);
                return scanner.nextByte();
            }catch (InputMismatchException e) {
                System.out.println("Error: s'esperava un valor enter. Torna a intruduir la dada: ");
                scanner.nextLine();
            }
        }
    }

    public static int llegirInt(String missatge){
        while (true) {
            try {
                System.out.println(missatge);
                return scanner.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Error: s'esperava un valor enter. Torna a introduir la dada: ");
                scanner.nextLine();
            }
        }
    }

    public static float llegirFloat(String missatge){
        while (true) {
            try {
                System.out.println(missatge);
                return scanner.nextFloat();
            }catch (InputMismatchException e) {
                System.out.println("Error: s'esperava un valor decimal. Torna a introduir la dada: ");
                scanner.nextLine();
            }
        }
    }

    public static double llegirDouble(String missatge){
        while (true) {
            try {
                System.out.println(missatge);
                return scanner.nextDouble();
            }catch (InputMismatchException e) {
                System.out.println("Error: s'esperava un valor decimal. Torna a introduir la dada: ");
                scanner.nextLine();
            }
        }
    }

    public static char llegirChar(String missatge){
        while (true) {
            try {
                System.out.println(missatge);
                return scanner.next().charAt(0);
            }catch (InputMismatchException e) {
                System.out.println("Error: s'esperava un caràcter. Torna a introduir la dada: ");
                scanner.nextLine();
            }
        }
    }

    public static String llegirString(String missatge){
        while (true) {
            try {
                System.out.println(missatge);
                return scanner.nextLine();
            }catch (InputMismatchException e) {
                System.out.println("Error: s'esperava una cadena de caràcters. Torna a introduir la dada: ");
                scanner.nextLine();
            }
        }
    }

    public static boolean llegirSiNo(String missatge){
        while (true) {
            try {
                System.out.println(missatge);
                String resposta = scanner.next();
                if (resposta.equals("s")) {
                    return true;
                } else if (resposta.equals("n")) {
                    return false;
                } else {
                    System.out.println("Error: s'esperaba 's' o 'n'. Torna a introduir la dada: " );
                }
            }catch (InputMismatchException e) {
                System.out.println("Error: s'esperaba 's' o 'n'. Torna a introduir la dada:  ");
                scanner.nextLine();
            }
        }
    }
}

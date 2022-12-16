package Practicas;

import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Facilite el numero que quiera saber si es par o no");
        int i = sc.nextInt();
        boolean resultado = DevolverTrueFalse.esPar(i);
        System.out.println(resultado);
    }
}

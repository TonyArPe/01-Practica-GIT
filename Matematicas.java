package Practicas;

import java.util.Scanner;

public class Matematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Facilite el numero que quiera saber si es par o no");
        int i = sc.nextInt();
        boolean resultado = TestMatematicas.esPar(i);
        resultado = TestMatematicas.esDivisiblePorTres(i);
        resultado = TestMatematicas.esDivisiblePorCinco(i);
        System.out.println(resultado);
        sc.close();

    }
}

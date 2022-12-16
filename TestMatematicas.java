package Practicas;

public class TestMatematicas {
    public static boolean esPar(int numero){
        if (numero % 2 == 0) {
            System.out.println("Es par");
            return true;
        }else{
            System.out.println("Es impar");
            return false;
        }

    }
    public static boolean esDivisiblePorTres(int numero){
        if(numero % 3 == 0){
            System.out.println("Es divisible entre 3");
            return true;
        }else{
            System.out.println("No es divisible entre 3");
            return false;
        }


    }
    public static boolean esDivisiblePorCinco(int numero){
        if(numero % 5 == 0){
            System.out.println("Es divisible entre 5");
            return true;
        }else{
            System.out.println("No es divisible entre 5");
            return false;
        }
    }
}

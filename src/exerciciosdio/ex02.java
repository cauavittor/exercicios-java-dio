package exerciciosdio;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
     //par ou impar positivo ou negativo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        if(numero % 2 == 0 && numero > 0){
            System.out.println("O numero "+numero+" é par e positivo");
        } else if (numero % 2 == 0 && numero < 0){
            System.out.println("O numero "+numero+" é par e negativo");
        } else if(numero % 2 > 0 && numero > 0){
            System.out.println("O numero "+numero+" é impar e positivo");
        }else {
            System.out.println("o numero "+numero+" é impar e negativo");
        }
    }
}

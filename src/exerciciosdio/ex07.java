package exerciciosdio;

import java.util.Scanner;

public class ex07 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um valor: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite um valor: ");
        int numero2 = scanner.nextInt();
        if (numero1 > 20 && numero2 > 20){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}

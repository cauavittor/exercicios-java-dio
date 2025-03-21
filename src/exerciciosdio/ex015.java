package exerciciosdio;

import java.util.Scanner;

public class ex015 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite os valores de A, B e C");
        System.out.println("A: ");
        int valorA = scanner.nextInt();
        System.out.println("B: ");
        int valorB = scanner.nextInt();
        System.out.println("C: ");
        int valorC = scanner.nextInt();
        if (valorA == valorB && valorB == valorC){
            System.out.println("triâgulo equilátero");
        } else if(valorA != valorB && valorB != valorC && valorC != valorA) {
            System.out.println("triângulo escaleno");
        } else {
            System.out.println("triângulo isoceles");
        }
    }
}

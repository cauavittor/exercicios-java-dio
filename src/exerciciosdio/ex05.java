package exerciciosdio;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float salarioMinimo = 1293;
        System.out.println("Digite seu salario atual:  ");
        float numero = scanner.nextFloat();
        String frase = "Salarios minimos";
        float calculo = (numero / salarioMinimo);
        System.out.printf("voce ganha: %.1f%n", calculo);
        System.out.println(frase);
        scanner.close();
        }
    }

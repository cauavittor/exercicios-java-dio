package exerciciosdio;

import java.util.Scanner;

public class ex01 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        // ler A, B e C e somar A+B e imprimir se a soma é maior que C
        System.out.println("Digite o valor do primeiro numero: ");
        double A = scanner.nextInt();
        System.out.println("Digite o valor do segundo numero: ");
        double B  = scanner.nextInt();
        System.out.println("Digite o valor do terceiro numero: ");
        double C = scanner.nextInt();
        double soma = A + B;
        if(soma > C){
            System.out.println("A soma de "+A+" e "+B+" é igual ha:"+soma+" sendo maior que "+C);
        } else if (soma == C) {
            System.out.println("os valores da soma dos primeiros numeros sao iguais ao ultimo");
        } else {
            System.out.println(C+" é maior que a soma dos dois primeiros numeros.");
        }
    }
}

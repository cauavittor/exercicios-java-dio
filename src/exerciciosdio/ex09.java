package exerciciosdio;

import java.util.Scanner;

public class ex09 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Insira seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("%.2f%n",imc);
        if(imc < 18.5){
            System.out.println("Voce esta abaixo do peso");

        } else if (imc > 18.5 && imc < 25){
            System.out.println("Voce esta no peso ideal");

        } else if (imc > 25 && imc < 30){
            System.out.println("Voce esta levemente acima do peso");

        } else if (imc > 30 && imc < 35){
            System.out.println("Voce esta no nivel de obesidade grau 1");

        } else if (imc > 35 && imc < 40){
            System.out.println("Voce esta no nivel grau 2 de obesidade");

        } else {
            System.out.println("Voce esta no nivel de obesidade severa. CUIDE DE SUA SAUDE.");
        }
    }
}

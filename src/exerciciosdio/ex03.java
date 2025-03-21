package exerciciosdio;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int num1 = scanner.nextInt();
        System.out.println("Digite um outro numero inteiro");
        int num2 = scanner.nextInt();
        if(num1 == num2){
            int soma = num1 + num2;
            System.out.println("como os dois valores sao iguais, a soma dos numeros é igual há: "+soma);
        } else {
            System.out.println("os dois numeros são diferentes, a multiplicação entre eles é igual ha "+(num1*num2));
        }
    }
}

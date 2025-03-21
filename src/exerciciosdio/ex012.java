package exerciciosdio;

import java.util.Scanner;

public class ex012 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Complete as informações abaixo.");
        System.out.println("Seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Sua idade: ");
        int idade = scanner.nextInt();
        if (idade >= 18){
            System.out.println(nome+", voce é maior de idade, portanto já possui idade para dirigir.");
        }
        else  {
            System.out.println(nome+", voce é menor de idade, portanto ainda não possui idade para dirigir.");
        }
    }
}

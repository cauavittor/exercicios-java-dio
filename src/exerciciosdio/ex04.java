package exerciciosdio;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("JOGO DO SUCESSOR E ANTECESSOR");
        System.out.println("--------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro para a operação: ");
        int numero = scanner.nextInt();
        int sucessor = numero + 1;
        int antecessor = numero - 1;
        System.out.println("O numero "+numero+" tem como sucessor o numero "+sucessor+" e como antecessor "+antecessor);
    }
}

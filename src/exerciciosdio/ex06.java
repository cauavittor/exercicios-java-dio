package exerciciosdio;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um valor qualquer: ");
        double numero = scanner.nextDouble();
        System.out.println("O valor de "+numero+" com reajuste de 5% fica: "+(numero - numero * 0.05));

    }
}

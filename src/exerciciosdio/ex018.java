package exerciciosdio;

import java.util.Scanner;

public class ex018 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        System.out.println("Escolha um numero para contagem da tabuada: ");
        int tabuadd = scanner.nextInt();
        int contador = 0;
        while (contador < tabuadd) {
            contador++;
            int resultado = numero * contador;
            System.out.println(numero + " X " + contador + " = " + resultado);
        }
    }
}

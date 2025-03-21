package exerciciosdio;

import java.util.Scanner;

public class ex021 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite dois numeros inteiros de sua escolha: ");
        System.out.println("Primeiro valor: ");
        double valor1 = scanner.nextInt();
        System.out.println("Segundo valor: ");
        double valor2 = scanner.nextInt();
        double quociente = valor1 / valor2;
        double resto = valor1 % valor2;
        System.out.println("Quociente da divisao: "+quociente);
        System.out.println("Resto da divisao: "+resto);
    }
}

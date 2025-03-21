package exerciciosdio;

import java.util.Scanner;

public class ex014 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o ano em que voce nasceu: ");
        int anoNascimento = scanner.nextInt();
        System.out.println("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();
        int calculo = anoAtual - anoNascimento;
        System.out.println("Voce viveu por "+calculo+" anos, "+(calculo * 12)+" meses e "+(calculo * 365)+" dias");

    }
}

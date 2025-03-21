package exerciciosdio;

import java.util.Scanner;

public class ex010 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        String nomeAluno = scanner.nextLine();
        System.out.println("Insira as suas tres ultimas notas de prova: ");
        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();
        float nota3 = scanner.nextFloat();
        float media = (nota1+nota2+nota3)/3;
        if (media >= 6.0){
            System.out.println("Parabens, "+nomeAluno+". Voce foi aprovado com a media de "+media);

        } else {
            System.out.println("Voce foi reprovado com uma media de "+media);

        }
    }
}

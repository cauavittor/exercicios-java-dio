package exerciciosdio;

import java.util.Scanner;

public class ex013 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int C = 0;
        System.out.println("Digite os seguintes valores.");
        System.out.println("A: ");
        int A = scanner.nextInt();
        System.out.println("B: ");
        int B = scanner.nextInt();

        C = B;
        B = A;
        System.out.println("O valor de A: "+C+" o valor de B: "+B);
    }
}

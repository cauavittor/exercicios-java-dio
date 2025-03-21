package exerciciosdio;

import java.util.Scanner;

public class ex016 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double temperaturaF = scanner.nextDouble();
        double celsius = (5 *(temperaturaF - 32)/9);
        System.out.println(temperaturaF+" convertido para celsius é igual há:" );
        System.out.print(celsius);

    }
}

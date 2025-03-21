package exerciciosdio;

import java.util.Scanner;

public class ex08 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite tres numeros inteiros: ");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        if (numero1 < numero2 && numero1 < numero3 && numero3 > numero2){
            System.out.print(numero3+" "+numero2+" "+ numero1+" ");

        } else if (numero1 > numero2 && numero1 < numero3){
            System.out.println(numero3+" " +numero1+" " +numero2+" ");

        } else if (numero2 < numero3 && numero1 > numero3){
            System.out.println(numero1+" "+numero3+" "+numero2+" ");

        } else if (numero3 < numero2 && numero2 < numero1){
            System.out.println(numero1+" "+numero2+" "+numero3+" ");

        } else if (numero1 < numero3 && numero3 < numero2){
            System.out.println(numero2+" "+numero3+" "+numero1+" ");

        } else {
            System.out.println(numero2+" "+numero1+" "+numero3+" ");
        }
    }
}

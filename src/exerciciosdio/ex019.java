package exerciciosdio;

import java.util.Random;

public class ex019 {
    public static void main (String[] args){
        Random aleatorio = new Random();
        int num = aleatorio.nextInt(0, 100);
        System.out.println(num);
    }

}

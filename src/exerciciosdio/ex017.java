package exerciciosdio;

public class ex017 {
    public static void main (String[] args){
        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;
        int anos = 0;
        while (alturaSara < alturaFrancisco){
            alturaSara = alturaSara + 0.03;
            alturaFrancisco = alturaFrancisco + 0.02;
            anos++;
            System.out.println("altura de sara: "+alturaSara+" no ano "+anos);
            System.out.println("altura de francisco: "+alturaFrancisco+" no ano "+anos);

        }
            System.out.println("seriam necessarios: "+anos);
    }
}

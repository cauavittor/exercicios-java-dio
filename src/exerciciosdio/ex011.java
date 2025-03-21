package exerciciosdio;

import java.util.Scanner;

public class ex011 {
    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);
        double taxa = 0;
        double parcela = 0;
        System.out.println("Digite o nome e o preço do produto.");
        System.out.println("nome: ");
        String nomeProduto = scanner.nextLine();
        System.out.println("preço: ");
        double precoProduto = scanner.nextDouble();
        System.out.println("Conforme a tabela abaixo, escolha uma das formas de pagamento: ");
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto.");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        int numeroEscolhido = scanner.nextInt();
        switch (numeroEscolhido){
            case 1:
                taxa = precoProduto * 0.15;
                System.out.println("O valor final fica: "+(precoProduto - taxa));
                break;
            case 2:
                 taxa = precoProduto * 0.10;
                System.out.println("O valor final fica: "+(precoProduto - taxa));
                break;
            case 3:
                parcela = precoProduto / 2;
                System.out.println("O valor final fica: "+parcela);
                break;
            case 4:
                taxa = precoProduto * 0.10;
                parcela = (precoProduto + taxa) / 3;
                System.out.println ("O valor final da parcela fica: "+parcela);
                break;

        }
    }
}

package exerciciosdio;

import java.util.Scanner;

public class ex022 {
    public static void main(String[] args) {
        // valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
        Scanner scanner = new Scanner (System.in);
        System.out.println("Complete as seguintes informações para o calculo do seu salario liquido final.");
        System.out.println("Hora aula: ");
        double horaAula = scanner.nextDouble();
        System.out.println("numeros de aulas lecionadas no mês: ");
        double aulasLecionadas = scanner.nextDouble();
        System.out.println("Desconto mensal do INSS (em porcento): ");
        double descontoInss = scanner.nextDouble();
        double salario = (horaAula * aulasLecionadas);
        double salarioFinal = salario * (descontoInss/100);
        System.out.println("O salario liquido final: "+(salario - salarioFinal));
    }
}

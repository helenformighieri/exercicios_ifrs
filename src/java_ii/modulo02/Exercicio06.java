package java_ii.modulo02;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        /*
        Para cada uma das mercadorias com que um armazém trabalha dispõe-se dos seguintes dados:
        − o nome da mercadoria;
        − o seu preço unitário;
        − a quantidade total vendida no mês.
        Elabore um programa para calcular o faturamento total mensal do armazém. O
        faturamento total do armazém será calculado somando-se o total faturado por
        cada mercadoria, que é igual a quantidade vendida da mercadoria vezes o seu
        preço unitário. O número de mercadorias comercializadas pelo armazém deve
        ser informado pelo usuário.
        */
        Scanner scanner = new Scanner(System.in);
        double faturamentoTotal = 0;

        System.out.println("Digite o número de mercadorias comercializadas pelo armazém: ");
        int numMercadorias = scanner.nextInt();

        for (int i = 1; i <= numMercadorias; i++) {
            System.out.println("Mercadoria " + i + ":");
            System.out.println("Digite o nome da mercadoria: ");
            String nome = scanner.next();

            System.out.println("Digite o preço unitario da mercadoria: ");
            double precoUnitario = scanner.nextDouble();

            System.out.println("Digite a quantidade total vendida no mês: ");
            int quantidadeVendida = scanner.nextInt();

            double faturamentoMercadoria = precoUnitario * quantidadeVendida;
            faturamentoTotal += faturamentoMercadoria;
        }
        System.out.println("O faturamento total mensal do armazém é: " + faturamentoTotal);
    }
}

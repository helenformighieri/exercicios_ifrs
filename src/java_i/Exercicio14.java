package java_i;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        /*
         Sabe-se que o quilowatt de energia custa um quinto do salário mínimo.
         Faça um programa que receba o valor do salário mínimo e a quantidade
         de quilowatts consumida por uma residência, calcule e mostre:

         a. o valor de cada quilowatt;
         b. o valor a ser pago por essa residência;
         c. o valor a ser pago com desconto de 15%.
        */
        Scanner scanner = new Scanner(System.in);

        double salarioMinimo, watts, valorWatts, valorResidencia, valorDesconto, total;

        System.out.println("Digite o valor do salario minimo: ");
        salarioMinimo = scanner.nextDouble();

        System.out.println("Digite a quantidade quilowatts: ");
        watts = scanner.nextDouble();

        valorWatts = salarioMinimo/5;
        valorResidencia = watts * valorWatts;
        valorDesconto = valorResidencia * 1.5/100;
        total = valorResidencia - valorDesconto;

        System.out.println("Sua fatura de energia é: " + total);
    }
}

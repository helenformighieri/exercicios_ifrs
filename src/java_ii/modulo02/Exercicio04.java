package java_ii.modulo02;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
        Faça um programa que receba várias idades, calcule e mostre a média
        das idades digitadas. Finalize digitando idade igual a zero.
        */
        Scanner scanner = new Scanner(System.in);

        int idade;
        int soma = 0;
        int contador = 0;

        System.out.println("Digite uma idade: ");
        idade = scanner.nextInt();

        while (idade != 0) {
            soma += idade;
            contador++;
            System.out.println("Digite uma idade: ");
            idade = scanner.nextInt();
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média das idades digitadas é: " + media);
        } else {
            System.out.println("Nenhuma idade foi digitada.");
        }

    }
}

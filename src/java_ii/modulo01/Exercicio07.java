package java_ii.modulo01;

import java.util.Scanner;

public class Exercicio07 {
    /*
    Desenvolva um programa que leia três valores numéricos inteiros,
    identifique e apresente o maior valor informado.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorUm, valorDois, valorTres;

        System.out.println("Digite o primeiro valor: ");
        valorUm = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        valorDois = scanner.nextInt();

        System.out.println("Digite o terceiro valor: ");
        valorTres = scanner.nextInt();

        int maior = valorUm;

        if (valorDois > maior) {
            maior = valorDois;
        }
        if (valorTres > maior) {
            maior = valorTres;
        }

        System.out.println("O maior valor informado é: " + maior);
    }
}

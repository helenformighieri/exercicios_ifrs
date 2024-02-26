package java_ii.modulo03;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
        Faça um programa que calcule o somatório, a soma dos quadrados e a
        média entre os (N) primeiros números inteiros positivos.
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int n = scanner.nextInt();

        int soma = 0;
        int somaQuadrados = 0;

        for (int i = 1; i <= n; i++) {
            soma += i;
            somaQuadrados += i * i;
        }
        double average = (double) soma / n;

        System.out.println("O somatório dos " + n + " primeiros números inteiros positivos é: " + soma);
        System.out.println("A soma dos quadrados dos " + n + " primeiros números inteiros positivos é: " + somaQuadrados);
        System.out.println("A média dos " + n + " primeiros números inteiros positivos é: " + average);
    }
}

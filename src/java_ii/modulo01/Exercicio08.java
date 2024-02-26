package java_ii.modulo01;

import java.util.Scanner;

public class Exercicio08 {
    /*
    Faça um programa que leia três valores numéricos inteiros, identifique e
    apresente o menor valor informado.
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

        int menor = valorUm;

        if (valorDois < menor){
            menor = valorDois;
        }
        if(valorTres < menor) {
            menor = valorTres;
        }

        System.out.println("O menor valor informado é: " + menor);
    }
}

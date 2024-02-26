package java_ii.modulo02;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
        Faça um programa que calcule a soma de dez números quaisquer
        fornecidos pelo usuário
        */

        Scanner input = new Scanner(System.in);

        int soma = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Digite um numero: ");
            int num = input.nextInt();
            soma += num;
        }

        System.out.println("Resultado da soma: " + soma);
    }
}

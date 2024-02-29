package java_ii.modulo03;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        /*
        Faça um programa que mostre o menu de opções a seguir, receba a opção
        digitada pelo usuário e os dados necessários para executar cada operação.
        Note que dependendo da opção escolhida pelo usuário, um conjunto de
        instruções diferente será executado. DICA: utilize as estruturas escolha e
        switch para executar conjuntos de instruções diferentes, dependendo da opção
        escolhida pelo usuário.
        Menu de opções:
        1. Somar dois números.
        2. Número ao quadrado.
        Digite a opção desejada
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para soma de dois numeros ou 2 para o quadrado do numero: ");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Digite o primeiro numero: ");
                int num1 = scanner.nextInt();
                System.out.println("Digite o segundo numero: ");
                int num2 = scanner.nextInt();

                int resultado = num1 + num2;

                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;
            case 2:
                System.out.println("Digite um número: ");
                int num = scanner.nextInt();

                int quadrado = num * num;

                System.out.println("O quadrado de " + num + " é " + quadrado);
                break;
            default:
                System.out.println("Opção invalida!");
        }
    }
}

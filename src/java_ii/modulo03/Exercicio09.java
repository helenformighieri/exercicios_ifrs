package java_ii.modulo03;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        /*
        A série de Fibonacci é formada pela seguinte sequência: 1, 1, 2, 3, 5, 8, 13,
        21, 34, 55, ... etc, onde o próximo número é igual a soma dos dois anteriores.
        Escreva um programa que gere os dez primeiros números da série de
        Fibonacci, utilizando estruturas repita e do...while.
        */
        Scanner scanner = new Scanner(System.in);
        int n;
        long termoAtual = 0;
        long termoAnterior = 1;

        System.out.println("Digite o número de termos desejado: ");
        n = scanner.nextInt();

        System.out.println("Sêquencia de Fibonacci com " + n + " termos: ");
        int contador = 0;

        do{
            System.out.println(termoAtual + " ");
            long proximoTermo = termoAtual + termoAnterior;
            termoAnterior = termoAtual;
            termoAtual = proximoTermo;
            contador++;
        }while (contador < n);

        System.out.println(" ");
    }
}

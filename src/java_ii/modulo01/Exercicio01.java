package java_ii.modulo01;

import java.util.Scanner;

public class Exercicio01 {
    /*
    Faça um programa que leia dois valores numéricos inteiros e apresente
    o resultado da diferença do maior valor pelo menor valor. Se os valores
    forem iguais, o programa deve mostrar zero.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o primeiro valor: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        num2 = scanner.nextInt();

        if (num1 > num2){
            int resultado = num1 - num2;
            System.out.println("Primeiro valor maior, a direferença é: " + resultado);
        }
        else if (num2 > num1) {
            int resultado = num2 - num1;
            System.out.println("Primeiro valor maior, a direferença é: " + resultado);
        }
        else if (num1 == num2) {
            System.out.println(0);
        }
    }
}

package java_ii.modulo01;

import java.util.Scanner;

public class Exercicio06 {
    /*
    Faça um programa que leia quatro valores numéricos inteiros e mostre
    os valores que são divisíveis por 2 ou 3.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C, D;

        System.out.println("Digite o primeiro valor: ");
        A = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        B = scanner.nextInt();

        System.out.println("Digite o terceiro valor: ");
        C = scanner.nextInt();

        System.out.println("Digite o terceiro valor: ");
        D = scanner.nextInt();

        if (A % 2 == 0 && A % 3 == 0){
            System.out.println(A);
        } else if (B % 2 == 0 && B % 3 == 0) {
            System.out.println(B);
        }else if (C % 2 == 0 && C % 3 == 0) {
            System.out.println(C);
        }else if (D % 2 == 0 && D % 3 == 0) {
            System.out.println(D);
        }else{
            System.out.println("Nenhum valor encontrado");
        }
    }
}

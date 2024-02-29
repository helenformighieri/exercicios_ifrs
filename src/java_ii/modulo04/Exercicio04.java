package java_ii.modulo04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
        Escreva um programa em Java que calcule as raízes de uma equação
        de segundo grau utilizando a fórmula de Báskara. A equação de
        segundo grau é uma equação no formato Ax2
        + Bx + C. O usuário deve
        informar os valores para A, B e C.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor de A:");
        double a = scanner.nextDouble();
        System.out.println("Informe o valor de B:");
        double b = scanner.nextDouble();
        System.out.println("Informe o valor de C:");
        double c = scanner.nextDouble();
        calculaRaizes(a, b, c);
        scanner.close();
    }

    public static void calculaRaizes(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("A equação possui uma raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais: " + raiz1 + " e " + raiz2);
        }
    }
}

package java_ii.modulo01;

import java.util.Scanner;

public class Exercicio03 {
    /*
    Construa um programa que leia três valores numéricos (representados
    pelas variáveis A, B e C) e faça o cálculo do delta de uma equação de
    segundo grau, segundo a fórmula de Báskara. O programa deve mostrar
    quantas raízes reais a equação possui (delta < 0 – mostrar uma
    mensagem dizendo que a equação não possui raízes reais, delta > 0 –
    mostrar que possui duas raízes reais, delta = 0 – mostrar que possui
    uma única raiz real).
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor de C: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta > 0) {
            System.out.println("A equação possui duas raízes reais.");
        } else {
            System.out.println("A equação possui uma única raiz real.");
        }

        scanner.close();
    }


}

package java_i;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        /*
        Faça um programa que calcule e mostre a área de um quadrado. Sabe-se que
        𝐴 = 𝑙𝑎𝑑𝑜2
        */
        Scanner scanner = new Scanner(System.in);

        double lado, area;

        System.out.println("Digite o lado do quadrado: ");
        lado = scanner.nextDouble();

        area = Math.pow(lado, 2);

        System.out.println("A área do quadrado é: " + area);

    }
}

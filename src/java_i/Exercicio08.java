package java_i;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /*
        Faça um programa que calcule e mostre a área de um triângulo. Sabese que: Área = (base x altura) / 2.
        A base e altura devem ser informadas pelo usuário.
        */
        Scanner read = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Digite a base: ");
        base = read.nextDouble();

        System.out.println("Digite a altura: ");
        altura = read.nextDouble();

        area = (base * altura)/2;

        System.out.println("A área do triângulo é: " + area);
    }
}

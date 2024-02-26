package java_i;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        /*
        Faça um programa que receba três notas e seus respectivos pesos,
        calcule e mostre a média ponderada dessas notas. Para calcular a
        média ponderada, multiplique cada nota por seus respectivos pesos,
        some todos os resultados e divida pela soma dos pesos. Por exemplo,
        se as notas forem 10, 5 e 6, e os pesos 1, 2 e 3, a média final do
        estudante seria 10 x 1 + 5 x 2+ 3 x 6, que resulta em 10 + 10 + 18 = 38.
        Esse valor deve ser dividido pela soma dos pesos (6), resultando em
        6,3.
        */
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, peso1, peso2, peso3, media;

        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.println("Digite o peso da primeira nota");
        peso1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.println("Digite o peso da segunda nota");
        peso2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();
        System.out.println("Digite o peso da terceira nota");
        peso3 = scanner.nextDouble();

        media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.println(media);
    }
}

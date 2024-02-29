package java_ii.modulo04;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /*
        Escreva um programa em Java que leia um número real qualquer e um
        número de casas decimais (inteiro) e o arredonde o número real para o
        número de casas especificado. Por exemplo, caso o usuário informe o
        número 1,1379 e 2 casas decimais, o número seria arredondado para
        1,14.
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número real: ");
        double numeroReal = scanner.nextDouble();

        System.out.print("Informe o número de casas decimais: ");
        int casasDecimais = scanner.nextInt();

        double fatorMultiplicacao = Math.pow(10, casasDecimais);

        double numeroArredondado = Math.round(numeroReal * fatorMultiplicacao) / fatorMultiplicacao;

        System.out.println("Número arredondado: " + numeroArredondado);

        scanner.close();
    }
}

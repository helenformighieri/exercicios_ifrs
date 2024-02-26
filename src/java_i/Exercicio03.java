package java_i;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        Faça um programa que receba três notas de um estudante, calcule e
        mostre a média aritmética entre elas (este exercício é similar ao exemplo
        mostrado a neste capítulo, mas leva em consideração três notas e não
        quatro).
        */

        Scanner read = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");

        float notaUm = read.nextFloat();
        float notaDois = read.nextFloat();
        float notaTres = read.nextFloat();
        float media = (notaUm + notaDois + notaTres)/3;

        System.out.println("Sua nota média é:  " + df.format(media));
    }
}

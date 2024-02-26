package java_i;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        /*
         Faça um programa que receba uma temperatura em Celsius, calcule e
         mostre essa temperatura em Fahrenheit.
        */
        Scanner scanner = new Scanner(System.in);

        double celcius, fahrenheit;

        System.out.println("Digite a temperetarua em graus Celcius: ");
        celcius = scanner.nextDouble();

        fahrenheit = celcius * 9/5 + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    }
}

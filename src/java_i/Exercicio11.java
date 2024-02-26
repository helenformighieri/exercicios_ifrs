package java_i;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        /*
        Faça um programa que receba o ano de nascimento de uma pessoa e o
        ano atual, calcule e mostre:
        a. a idade dessa pessoa em anos;
        b. a idade dessa pessoa em meses;
        c. a idade dessa pessoa em dias (considerando que cada ano
        possui 365 dias);
        d. a idade dessa pessoa em semanas (cada ano possui 52
        semanas).
        */
        Scanner scanner = new Scanner(System.in);

        int idade, meses, semanas, dias;

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        meses = idade * 12;
        semanas = idade * 52;
        dias = idade * 365;

        System.out.println("Idade: " + idade + "\nEm meses: " + meses + "\nEm semanas: " + semanas + "\nEm dias: " + dias);
    }
}

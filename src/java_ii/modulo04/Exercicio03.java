package java_ii.modulo04;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        Escreva um programa em Java que leia um string contendo um número
        em binário e o mostre em decimal na tela.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número binário:");
        String binario = scanner.nextLine();

        int decimal = 0;

        for (int i = binario.length() - 1; i >= 0; i--) {
            char bit = binario.charAt(i);
            decimal += (bit - '0') * Math.pow(2, binario.length() - 1 - i);
        }

        System.out.println("O número decimal correspondente é: " + decimal);


    }
}

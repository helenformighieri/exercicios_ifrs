package java_ii.modulo02;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        Crie um programa Java para exibir os quadrados de números digitados
        pelo usuário, até que ele digite um número negativo
        */
        Scanner scanner = new Scanner(System.in);
        int num;

        while(true){
            System.out.println("Digite um numero para saber o quadrado ou um numero negativo para encerrar: ");
            num = scanner.nextInt();

            if (num < 0){
                System.out.println("Fim do programa");
                break;
            }
            int quadrado = num * num;
            System.out.println("O quadrado de " + num + " é " + quadrado);
            System.out.println("Digite outro numero: ");
        }


    }
}

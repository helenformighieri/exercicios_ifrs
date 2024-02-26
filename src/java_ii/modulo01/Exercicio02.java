package java_ii.modulo01;

import java.util.Scanner;

public class Exercicio02 {
    /*
    Faça um programa que leia um valor numérico inteiro. O programa deve
    apresentar a mensagem “O valor está na faixa permitida”, caso o valor
    informado esteja entre 1 e 9. Se o valor estiver fora da faixa, o programa
    deve apresentar a mensagem “O valor está fora da faixa permitida”.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Digite um número entre 1 e 9: ");
        num = scanner.nextInt();

        if (num >= 1 && num <= 9){
            System.out.println("O valor está na faixa permitida");
        }else{
            System.out.println("O valor está fora da faixa permitida");
        }
    }
}

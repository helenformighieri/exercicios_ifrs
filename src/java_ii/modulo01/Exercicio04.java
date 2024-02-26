package java_ii.modulo01;

import java.util.Scanner;

public class Exercicio04 {
    /*
    Construa um programa que leia três valores para os lados de um
    triângulo (A, B e C). O programa deve verificar se os lados fornecidos
    formam realmente um triângulo. Em caso positivo, deve mostrar a
    mensagem “Os lados formam um triângulo” e caso contrário “Os valores
    informados não podem formar um triângulo”. Para que três valores de
    lados formem um triângulo, cada par de lados somados não pode ser
    menor ou igual ao terceiro lado.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C;

        System.out.println("Digite o primeiro valor: ");
        A = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        B = scanner.nextInt();

        System.out.println("Digite o terceiro valor: ");
        C = scanner.nextInt();

        if (A == B && B == C && C == A){
            System.out.println("Este objeto é um triângulo.");
        }else{
            System.out.println("Não é um triângulo.");
        }
    }
}

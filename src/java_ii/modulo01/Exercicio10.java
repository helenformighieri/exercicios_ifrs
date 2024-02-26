package java_ii.modulo01;

import java.util.Scanner;

public class Exercicio10 {
    /*
    A nota final de um estudante é calculada a partir de três notas
    atribuídas, respectivamente, a um trabalho de laboratório, a uma
    avaliação semestral e a um exame final. A média das três notas
    mencionadas obedece aos pesos a seguir:
    Notas                      Peso
    Trabalho de Lab.           2
    Av. Semestral              3
    Exame Final                5

    Faça um programa que receba as três notas, calcule e mostre a média
    ponderada e o conceito que segue a tabela
    8 ate 10 A
    7 ate 8  B
    6 ate 7  C
    5 ate 6  D
    0 ate 5  E
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notaUm, notaDois, notaTres, trabLab, avSem, exFinal;
        double pesoTl = 2;
        double pesoAs = 3;
        double pesoEf = 5;

        System.out.println("Digite sua primeira nota: ");
        notaUm = scanner.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        notaDois = scanner.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        notaTres = scanner.nextDouble();

        double media =((notaUm * pesoTl) + (notaDois * pesoAs) + (notaTres * pesoEf)) / (pesoTl + pesoAs + pesoEf);

        if (media <= 10 && media >= 8){
            System.out.println("A");
        } else if (media < 8 && media >= 7) {
            System.out.println("B");
        } else if (media < 7 && media >= 6) {
            System.out.println("C");
        } else if (media < 6 && media >= 5) {
            System.out.println("D");
        } else if (media < 5 && media >= 0) {
            System.out.println("E");
        }

    }
}

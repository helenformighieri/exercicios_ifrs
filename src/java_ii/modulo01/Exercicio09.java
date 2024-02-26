package java_ii.modulo01;

import java.util.Scanner;

public class Exercicio09 {
    /*
    Uma empresa decide dar um aumento de 30% aos funcionários cujo
    salário é inferior a 5000. Escreva um programa que possa ser utilizado
    para efetuar o cálculo do salário reajustado de um funcionário, a partir
    do valor do salário informado pelo usuário.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario;

        System.out.println("Digite o valor do seu salario: ");
        salario = scanner.nextDouble();

        if (salario < 5000){
            salario = salario + (salario * 30 / 100);
            System.out.println("Parabens voce recbeu um aumento, seu salario agora é:  " + salario);
        }
    }
}

package java_i;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /*
        Faça um programa que receba o salário base de um funcionário, calcule
        e mostre o salário a receber, sabendo-se que o funcionário tem
        gratificação de 5% sobre o salário base (que será acrescentado ao
        salário) e paga imposto de 7% sobre este salário (o que será
        descontado do salário)
        */

        Scanner read = new Scanner(System.in);

        System.out.println("Digite seu salario: ");
        float salarioBase = read.nextFloat();

        float salarioGratificacao = salarioBase * 0.5F;
        float salarioDesconto = salarioBase * 0.7F;

        float salarioFinal = (salarioBase + salarioGratificacao) - salarioDesconto;

        System.out.println(salarioFinal);
    }
}

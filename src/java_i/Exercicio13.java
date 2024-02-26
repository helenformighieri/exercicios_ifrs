package java_i;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        /*
        Faça um programa que receba o número de horas trabalhadas e o valor
        do salário mínimo, calcule e mostre o salário a receber seguindo estas
        regras:

        a. a hora trabalhada vale um décimo do salário mínimo;

        b. o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;

        c. o imposto equivale a 3% do salário bruto;

        d. o salário a receber equivale ao salário bruto menos o imposto.
        */
        Scanner read = new Scanner(System.in);

        double horasTrabalhadas, valorSalarioMinimo, imposto, valorHora, salarioBruto, salarioFinal;

        System.out.println("Digite o valor do salario minimo: ");
        valorSalarioMinimo = read.nextDouble();

        System.out.println("Digite suas horas trabalhadas: ");
        horasTrabalhadas = read.nextDouble();

        valorHora = valorSalarioMinimo/10;
        salarioBruto = horasTrabalhadas * valorHora;
        imposto = salarioBruto * 0.03;
        salarioFinal = salarioBruto - imposto;

        System.out.println("Seu salario: " + salarioFinal);
    }
}

package java_i;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        /*
        Um funcionário recebe um salário fixo mais 4% de comissão sobre as
        vendas (4% do valor das vendas efetuadas pelo funcionário). Faça um
        programa que receba o salário fixo do funcionário e o valor de suas
        vendas, calcule e mostre a comissão e seu salário final.

         */
        Scanner read = new Scanner(System.in);

        float salario, comissao, vendas, salarioFinal;

        System.out.println("Digite seu salario: ");
        salario = read.nextFloat();

        System.out.println("Digite o valor das suas vendas: ");
        vendas = read.nextFloat();

        comissao = (vendas * 4)/100;
        salarioFinal = comissao + salario;

        System.out.println("Sua comissão este: " + comissao + "\nSeu salario final: " + salarioFinal);

    }
}

package java_i;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        /*
         O custo ao consumidor de um carro novo é a soma do preço de fábrica
         com o percentual de lucro do distribuidor e dos impostos aplicados ao
         preço de fábrica. Faça um programa que receba o preço de fábrica de
         um veículo, o percentual de lucro do distribuidor e o percentual de
         impostos, calcule e mostre:
         a. o valor correspondente ao lucro do distribuidor;

         b. o valor correspondente aos impostos;

         c. o preço final do produto.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço de fábrica do veículo:");
        double precoFabrica = scanner.nextDouble();

        System.out.println("Digite o percentual de lucro do distribuidor:");
        double percentualLucro = scanner.nextDouble();

        System.out.println("Digite o percentual de impostos:");
        double percentualImpostos = scanner.nextDouble();

        double lucroDistribuidor = (precoFabrica * percentualLucro) / 100;
        double valorImpostos = (precoFabrica * percentualImpostos) / 100;
        double precoFinal = precoFabrica + lucroDistribuidor + valorImpostos;

        System.out.println("O valor correspondente ao lucro do distribuidor é: " + lucroDistribuidor);
        System.out.println("O valor correspondente aos impostos é: " + valorImpostos);
        System.out.println("O preço final do produto é: " + precoFinal);
    }
}

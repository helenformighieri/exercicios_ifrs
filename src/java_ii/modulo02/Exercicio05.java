package java_ii.modulo02;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /*
        Crie um programa para ler a quantidade de litros de combustível e a
        distância percorrida por um carro em várias viagens. O programa deve
        calcular o consumo médio do carro, que é igual a média de quilômetros
        por litro de todas as viagens. O número de viagens realizado deve ser
        informado pelo usuário.
        */
        Scanner scanner = new Scanner(System.in);

        int viagens;
        double consumo = 0;

        System.out.println("Digite quantas viagens você fez: ");
        viagens = scanner.nextInt();

        for (int i = 1; i <= viagens; i++) {
            System.out.println("Viagem " + i);

            System.out.println("Digite a quantidade de combustivel consumidos: ");
            double litros = scanner.nextDouble();

            System.out.println("Digite a kilometragem: ");
            double km = scanner.nextDouble();

            consumo += km / litros;
        }

        double consumoMedio = consumo / viagens;
        System.out.println("O consumo médio do carro é: " + consumoMedio + " km/l");
    }
}

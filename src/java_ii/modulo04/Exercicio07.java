package java_ii.modulo04;

import java.util.Scanner;

public class Exercicio07 {

    public static double calcularPotencia(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public static double calcularRaizQuadrada(double num) {
        return Math.sqrt(num);
    }

    public static double calcularRaizCubica(double num) {
        return Math.cbrt(num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escolha uma opção (1, 2 ou 3): ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                double resultadoPotencia = calcularPotencia(num1, num2);
                System.out.println("Resultado: " + resultadoPotencia);
                break;
            case 2:
                double resultadoRaizQuadrada1 = calcularRaizQuadrada(num1);
                double resultadoRaizQuadrada2 = calcularRaizQuadrada(num2);
                System.out.println("Raiz quadrada do primeiro número: " + resultadoRaizQuadrada1);
                System.out.println("Raiz quadrada do segundo número: " + resultadoRaizQuadrada2);
                break;
            case 3:
                double resultadoRaizCubica1 = calcularRaizCubica(num1);
                double resultadoRaizCubica2 = calcularRaizCubica(num2);
                System.out.println("Raiz cúbica do primeiro número: " + resultadoRaizCubica1);
                System.out.println("Raiz cúbica do segundo número: " + resultadoRaizCubica2);
                break;
            default:
                System.out.println("Opção inválida. Encerrando o programa.");
        }

        scanner.close();
    }
}

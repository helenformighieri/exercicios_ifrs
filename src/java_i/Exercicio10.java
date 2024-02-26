package java_i;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        /*
        Sabe-se que:
        1 pé = 12 polegadas
        1 jarda = 3 pés
        1 milha = 1.760 jardas
        Faça um programa que receba uma medida em pés, faça as
        conversões a seguir e mostre os resultados.
        a. polegadas;
        b. jardas;
        c. milhas.
        */
        Scanner scanner = new Scanner(System.in);

        double pes;

        System.out.println("Digite a medida em pés: ");
        pes = scanner.nextDouble();

        double polegadas = pes * 12;
        double jardas = pes / 3;
        double milhas = pes / 5280;

        polegadas = Math.round(polegadas * 100.0) / 100.0;
        jardas = Math.round(jardas * 100.0) / 100.0;
        milhas = Math.round(milhas * 100.0) / 100.0;

        System.out.println("Polegadas: " + polegadas + "\nJardas: " + jardas + "\nMilhas: " + milhas);

    }
}

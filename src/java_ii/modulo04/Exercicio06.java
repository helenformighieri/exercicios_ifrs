package java_ii.modulo04;

public class Exercicio06 {
    public static void main(String[] args) {
        /*
        Escreva um programa em Java que simule o lançamento de um dado,
        ou seja, sorteie um número entre 1 e 6
        */
        int resultado = (int) (Math.random() * 6) + 1;
        System.out.println("Resultado do lançamento do dado: " + resultado);
    }
}

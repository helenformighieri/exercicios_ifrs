package java_ii.modulo04;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
        Escreva um programa em Java que calcule e mostre a raiz quadrada
        dos números de 1 a 100. Em cada linha de saída, o programa deve
        mostrar o número e sua raiz quadrada.
        */
        for (int i = 1; i <= 100; i++) {
            double raizQuadrada = Math.sqrt(i);
            System.out.println(raizQuadrada);
        }
    }
}

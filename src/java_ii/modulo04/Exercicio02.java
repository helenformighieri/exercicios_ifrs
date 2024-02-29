package java_ii.modulo04;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
        Escreva um programa em Java que mostre os números os números de 0
        a 100 e seus correspondentes em binário.
        */
        for(int i = 0;i <=100;i++){
            System.out.println(i + " em binário é " + Integer.toBinaryString(i));
        }
    }
}

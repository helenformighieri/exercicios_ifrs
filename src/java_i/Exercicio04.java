package java_i;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
        Faça um programa que receba o preço de um produto, calcule e mostre
        o novo preço, sabendo-se que este sofreu um desconto de 10%. Por
        exemplo, se o produto custa R$ 100,00, o novo preço será 100 menos
        10% de cem, que é 100 x 10 / 100. Essa conta é igual a 10, ficando o
        novo preço R$ 90,00.
        */

        Scanner read = new Scanner(System.in);

        System.out.println("Valor do produto: ");
        float valorProduto = read.nextFloat();

        float desconto = valorProduto * 10/100;
        float valorComDesconto = valorProduto - desconto;

        System.out.println("Com desconto seu produto fica: " + valorComDesconto);


    }
}

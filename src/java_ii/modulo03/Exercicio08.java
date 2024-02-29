package java_ii.modulo03;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo e um programa, utilizando as estruturas repita e do..while
        que repita a leitura de uma senha até que o usuário digite o número 1234. Após
        isso, mostrar a mensagem “Senha correta, acesso liberado.”
        */
        Scanner scanner = new Scanner(System.in);

        int senha = 1234;

        System.out.println("Digite a senha correta: ");
        int usuarioSenha = scanner.nextInt();

        while (usuarioSenha != senha){
            System.out.println("Senha incorreta, digite novamente.");
            usuarioSenha = scanner.nextInt();
        }

        System.out.println("Acesso liberado");
    }
}

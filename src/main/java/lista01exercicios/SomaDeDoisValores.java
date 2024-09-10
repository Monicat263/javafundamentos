
/*
    Exercício 01
    Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
  -- Entrada: 10 e 30
  -- Saida: Soma = 40
 */
package lista01exercicios;

import java.util.Scanner;

public class SomaDeDoisValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o primeiro número: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;
        System.out.println("SOMA = " + soma);

        sc.close();

    }
}


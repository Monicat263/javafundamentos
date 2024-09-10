/*
 Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
 calcule e mostre a diferença do produto
 de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */

package lista01exercicios;

import java.util.Scanner;

public class DiferencaProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite n1:");
        int a = sc.nextInt();

        System.out.println("Digite n1:");
        int b = sc.nextInt();

        System.out.println("Digite n1:");
        int c = sc.nextInt();

        System.out.println("Digite n1:");
        int d = sc.nextInt();

        int difereca = (a * b) - (c * d );

        System.out.println("DIFERENÇA = " + difereca);

        sc.close();
    }
}

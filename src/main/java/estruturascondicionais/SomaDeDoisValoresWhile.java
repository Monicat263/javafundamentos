/*
Enunciado 1:
Escreva um programa em Java que leia números inteiros inseridos pelo usuário e
some esses números. O programa deve continuar pedindo números até que o usuário
digite o número zero,
momento em que a soma dos números inseridos deve ser exibida.
 */

package estruturascondicionais;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SomaDeDoisValoresWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        double soma;

        // Solicitar o primeiro número
        System.out.println("Digite um número (ou 0 para sair): ");
        num1 = scan.nextInt();

        // Enquanto num1 for diferente de 0
        while (num1 != 0) {
            // Solicitar o segundo número
            System.out.println("Digite outro número (ou 0 para sair): ");
            num2 = scan.nextInt();

            // Verificar se o segundo número é 0 para encerrar o programa
            if (num2 == 0) {
                break; // Sai do laço se num2 for 0
            }

            // Calcular e exibir a soma
            soma = num1 + num2;
            System.out.println("A soma é: " + soma);

            // Solicitar um novo número para num1
            System.out.println("Digite um número (ou 0 para sair): ");
            num1 = scan.nextInt();
        }

        System.out.println("Programa encerrado.");
    }
}

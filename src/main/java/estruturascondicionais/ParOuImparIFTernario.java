/*
 Descrição: Crie um programa que leia um número inteiro e determine se ele é par ou ímpar,
 usando o operador ternário para exibir o resultado.
 
 */
package estruturascondicionais;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ParOuImparIFTernario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");
        int num = scan.nextInt();

        String resultado = (num % 2 ==0 ) ? "Par" : "Impar";
        System.out.println("O número é: " + resultado);
    }
}

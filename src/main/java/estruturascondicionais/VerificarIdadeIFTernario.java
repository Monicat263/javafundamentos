/*
    Descrição: Crie um programa que leia a idade de uma pessoa e, usando o
    operador ternário, exiba se a  pessoa é maior ou menor de idade (considerando
    a maioridade como 18 anos).
 */
package estruturascondicionais;

import java.util.Scanner;

public class VerificarIdadeIFTernario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idadeDigitada = scan.nextInt();

        String analiseIdade = (idadeDigitada < 18 ) ? "Menor de idade" : "Maior de idade";
        System.out.println(analiseIdade);

        scan.close();
    }
}

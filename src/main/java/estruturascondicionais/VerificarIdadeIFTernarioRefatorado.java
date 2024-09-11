/*
    Descrição: Crie um programa que leia a idade de uma pessoa e, usando o
    operador ternário, exiba se a  pessoa é maior ou menor de idade (considerando
    a maioridade como 18 anos).
 */
package estruturascondicionais;

import java.util.Scanner;

public class VerificarIdadeIFTernarioRefatorado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idadeDigitada = scan.nextInt();
        System.out.println("Você é: " + verificaIdade(idadeDigitada));

        scan.close();
    }
    public static String verificaIdade(int idadeDigitada){
        return (idadeDigitada < 0) ? "Idade inválida" :
               (idadeDigitada < 18 ) ? "Menor de idade" : "Maior de idade";

    }
}

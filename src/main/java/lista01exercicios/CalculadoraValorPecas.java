/*
   Fazer um programa para ler:
    o código de uma peça 1,
    o número de peças 1,
    o valor unitário de cada peça 1,
    o código de uma peça 2,
    o número de peças 2 e
    o valor unitário de cada peça 2.
    Calcule e mostre o valor a ser pago
 */

package lista01exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraValorPecas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the code: ");
        String cod01 = sc.nextLine();

        System.out.println("Enter the quantity: ");
        int qtde01 = Integer.parseInt(sc.nextLine()); // Lê como string e converte para int

        System.out.println("Enter the unit price: ");
        double vlr01 = Double.parseDouble(sc.nextLine()); // Lê como string e converte para double

        System.out.println("Enter the code: ");
        String cod02 = sc.nextLine();

        System.out.println("Enter the quantity: ");
        int qtde02 = Integer.parseInt(sc.nextLine()); // Lê como string e converte para int

        System.out.println("Enter the unit price: ");
        double vlr02 = Double.parseDouble(sc.nextLine()); // Lê como string e converte para double

        double  totalPec01 = qtde01 * vlr01 ;
        double  totalPec02 = qtde02 * vlr02 ;

        double total = totalPec01 + totalPec02;

        System.out.printf("VALOR A PAGAr R$ : %.2f " , total);

        sc.close();

    }
}

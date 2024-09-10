/*
    Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
    hora e calcula o salário desse funcionário.
    A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 */

package lista01exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do funcionário: ");
        int numfuncionario = sc.nextInt();
        sc.nextLine(); // Consome a nova linha após o número do funcionário

        System.out.println("Total de horas trabalhadas: ");
        double hTrabalhadas = Double.parseDouble(sc.nextLine()); // Lê como string e converte para double

        System.out.println("Valor hora: ");
        double vlHora = Double.parseDouble(sc.nextLine()); // Lê como string e converte para double

        double salario = hTrabalhadas * vlHora;

        System.out.printf("NUMBER = %d%n", numfuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}

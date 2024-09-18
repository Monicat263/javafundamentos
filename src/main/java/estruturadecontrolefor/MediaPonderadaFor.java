/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3
valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
valores, sendo que o primeiro valor tem peso 2,
o segundo valor tem peso 3 e o terceiro valor tem peso 5.
 */

package estruturadecontrolefor;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderadaFor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int iniciarPrograma = 3; // Valor que o usuário precisa digitar para iniciar
        int numDigitado;

        do {
            System.out.println("Ditite 3 para iniciar: ");
            numDigitado = sc.nextInt();
        } while (numDigitado != iniciarPrograma);

        for (int i = 0; i < numDigitado; i++) {
            System.out.println("Ditite nota1 : ");
            double n1 = sc.nextDouble();
            System.out.println("Ditite nota2 : ");
            double n2 = sc.nextDouble();
            System.out.println("Ditite nota3 : ");
            double n3 = sc.nextDouble();

            double mediaPonderada = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;

            System.out.printf("Média ponderada %d : %.1f%n  ", (i + 1), mediaPonderada);
        }
        sc.close();
    }

}


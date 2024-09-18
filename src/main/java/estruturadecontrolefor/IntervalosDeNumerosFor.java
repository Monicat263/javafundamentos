/*
    Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
    Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
    essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */
package estruturadecontrolefor;

import java.util.Scanner;

public class IntervalosDeNumerosFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos números você deseja verificar: ");
        int numDigitado = sc.nextInt(); // Número de entradas

        int in = 0;  // Contador para números dentro do intervalo [10, 20]
        int out = 0; // Contador para números fora do intervalo

        // Loop para ler os números e verificar se estão dentro ou fora do intervalo
        for (int i = 0; i < numDigitado; i++) {
            System.out.print("Digite um número: ");
            int x = sc.nextInt();

            // Verificação se o número está dentro do intervalo [10, 20]
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }

        // Exibe os resultados
        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}


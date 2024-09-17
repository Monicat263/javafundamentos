/*
    Fazer um progrma que lê um valor inteiro N e depois N números inteiros.
    Ao final, mostra a soma dos N números lidos
    exemplo digite o número 3 (isso significa que vc vai digitar mais 3 números ) que nesse caso são 5,2,4
    o resultado da soma será 11
 */

package estruturadecontrolefor;

import java.util.Scanner;

public class LerNumerosInteirosFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int numDigitado = scan.nextInt();
        int soma = 0;

        for (int i = 0;  i < numDigitado ; i++) {
            int x = scan.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);

        scan.close();
    }
}

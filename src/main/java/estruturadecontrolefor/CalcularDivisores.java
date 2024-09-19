/*
    Ler um número inteiro N e calcular todos os seus divisores.
 */
package estruturadecontrolefor;

import java.util.Scanner;

public class CalcularDivisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDigitado;

        do {
            System.out.println("Digite um número inteiro: ");
            numDigitado = sc.nextInt();
        }while(numDigitado<=0);

       System.out.println("Os divisores de " + numDigitado + " são:");

        for (int i = 1; i <= numDigitado; i++) {
            if (numDigitado % i == 0){
                System.out.println(i);
            }

        }
        sc.close();
    }
}

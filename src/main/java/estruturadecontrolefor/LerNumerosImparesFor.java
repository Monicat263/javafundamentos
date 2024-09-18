/*
  Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha,
  inclusive o X, se for o caso.
 */

package estruturadecontrolefor;

import java.util.Scanner;

public class LerNumerosImparesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDigitado = sc.nextInt();

        // O loop vai de 1 até o número digitado
        for (int i = 0; i <= numDigitado; i++){
            // Verifica se o número é ímpar
            if(i %2 !=0){
              System.out.println(i);

            }
        }
        sc.close();
    }
}

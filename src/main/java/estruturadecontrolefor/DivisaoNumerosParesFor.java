/*
    Fazer um programa para ler um número N.
    Depois leia N pares de números e mostre a divisão do primeiro pelo segundo.
    Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"
 */

package estruturadecontrolefor;

import java.util.Scanner;

public class DivisaoNumerosParesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ditite um número: ");
        int numDigitado = sc.nextInt();

        for (int i = 0 ; i< numDigitado; i++){
            int n = sc.nextInt();
            int y = sc.nextInt();
            if(y == 0){
                System.out.println("divisão impossivel");
            }else {
                double div = (double) n / y;
                System.out.printf("%.1f%n",div);
            }

        }
        sc.close();
    }
}

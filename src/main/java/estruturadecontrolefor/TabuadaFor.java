/*
    Leia um número qualquer e em seguida exiba a  tabuada dele
 */
package estruturadecontrolefor;

import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numDigitado = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            int prod = i * numDigitado;
            System.out.println( i + " x " + numDigitado + " = "+ prod);

        sc.close();
        }
    }
}

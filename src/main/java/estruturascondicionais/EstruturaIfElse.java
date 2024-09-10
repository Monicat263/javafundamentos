/*
    Elabore um programa que ao digitar as horas ele retorne a msg:
      - Bom dia;
      - Boa tarde;
      - Boa noite.
 */

package estruturascondicionais;

import java.util.Scanner;

public class EstruturaIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as horas:");
        int horaDigitada = scan.nextInt();

        if (horaDigitada >= 1 && horaDigitada <= 11) {
            System.out.println(("Good morning !!"));
        } else if (horaDigitada > 11 && horaDigitada <= 17) {
            System.out.println("Afternoon!");
        } else {
            System.out.println("Good evening");
        }
        scan.close();
    }
}

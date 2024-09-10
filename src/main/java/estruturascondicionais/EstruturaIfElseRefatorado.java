/*
    Elabore um programa que ao digitar as horas ele retorne a msg:
      - Bom dia;
      - Boa tarde;
      - Boa noite.
 */

package estruturascondicionais;

import java.util.Scanner;

public class EstruturaIfElseRefatorado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as horas:");
        int horaDigitada = scan.nextInt();
        scan.close();

        String mensagem = getMensagemPorHora(horaDigitada);
        System.out.println(mensagem);
    }

    // metodo que contém a lógia para retorar a mensagem apropridada
    public static String getMensagemPorHora(int hora) {
        if (hora >= 1 && hora <= 11) {
            return "Good morning !!";
        } else if (hora > 11 && hora <= 17) {
            return "Afternoon!";
        } else {
            return "Good evening";
        }
    }
}

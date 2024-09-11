/*
       Fazer um programa para ler um valor inteiro e informar o dia da semana, sendo:
       1 domingo, 2 segunda e assim por diante
 */

package estruturascondicionais;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DiasDaSemanaSwitch {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro de 1 a 7: ");
        int numDigitado = scan.nextInt();

        switch (numDigitado){
            case 1:
                System.out.println("Dia da semana: domingo");
                break;
            case 2:
                System.out.println("Dia da semana: Segunda");
                break;
            case 3:
                System.out.println("Dia da semana: Terça");
                break;
            case 4:
                System.out.println("Dia da semana: Quarta");
                break;
            case 5:
                System.out.println("Dia da semana: Quinta");
                break;
            case 6:
                System.out.println("Dia da semana: Sexta");
                break;
            case 7:
                System.out.println("Dia da semana:Sábado");
                break;
            default:
                System.out.println("Número inválido");
        }

    }

}

/*
       Fazer um programa para ler um valor inteiro e informar o dia da semana, sendo:
       1 domingo, 2 segunda e assim por diante
 */

package estruturascondicionais;

import java.util.Scanner;

public class DiasDaSemanaSwitchRefatorado {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            DiasDaSemanaSwitchRefatorado  dias = new DiasDaSemanaSwitchRefatorado();

            System.out.println("Digite um número inteiro de 1 a 7: ");
            int numDigitado = scan.nextInt();

            System.out.println(dias.getDiaDaSemana(numDigitado));
        }
        public String getDiaDaSemana(int numDigitado) {
            switch (numDigitado) {
                case 1:
                    return "Domingo";
                case 2:
                    return "Segunda";
                case 3:
                    return "Terça";
                case 4:
                    return "Quarta";
                case 5:
                    return "Quinta";
                case 6:
                    return "Sexta";
                case 7:
                    return "Sábado";
                default:
                    return "Número inválido";
            }
        }
    }
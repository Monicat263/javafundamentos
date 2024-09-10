/*
    Uma operadora de telefonia cobra
    R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone.
    Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00.
        Fazer um programa para ler a  quantidade de minutos que uma pessoa consumiu,
        daí mostrar o valor a ser pago.
        Utilize a estrutura de controle if else
 */

package estruturascondicionais;
import java.util.Locale;
import java.util.Scanner;


public class CalcularFaturaTelefonia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);
        double franquiaMinutosMes = 100;
        double vlrMinuto = 2.00;
        double vlrPlanoBasico = 50.00;
        double totalPagar;


        System.out.println("Enter the number of minutes used: ");
        String minUtilizadosStr = scan.next();
        minUtilizadosStr = minUtilizadosStr.replace(",", ".");
        double minutosUtilizados = Double.parseDouble(minUtilizadosStr);

        if (minutosUtilizados <= franquiaMinutosMes) {
            System.out.printf("Value to pay: R$ %.2f%n", vlrPlanoBasico);
        } else {
            double minutosExcedentes = minutosUtilizados - franquiaMinutosMes;
            totalPagar = ( (minutosExcedentes * vlrMinuto) + vlrPlanoBasico  );
            System.out.printf("Value to pay: R$ %.2f%n",totalPagar);

            scan.close();

        }

    }
}


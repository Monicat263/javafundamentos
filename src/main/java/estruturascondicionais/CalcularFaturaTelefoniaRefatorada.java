/*
    Uma operadora de telefonia cobra
    R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone.
    Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00.
        Fazer um programa para ler a  quantidade de minutos que uma pessoa consumiu,
        daí mostrar o valor a ser pago.
        Utilize a estrutura de controle if else
     Agora vamos refatorar a classe para facilitar na criação de testes unitários
     O precisa ser feito:
        Mover a lógica para um método que possa ser facilmente testado
 */

package estruturascondicionais;

public class CalcularFaturaTelefoniaRefatorada {
    // Método que calcula o valor a pagar com base nos minutos utilizados
    public double calcularTotalPagar(double minutosUtilizados) {
        double franquiaMinutosMes = 100;
        double vlrMinuto = 2.00;
        double vlrPlanoBasico = 50.00;

        if (minutosUtilizados <= franquiaMinutosMes) {
            return vlrPlanoBasico;
        } else {
            double minutosExcedentes = minutosUtilizados - franquiaMinutosMes;
            return (minutosExcedentes * vlrMinuto) + vlrPlanoBasico;
        }
    }
}
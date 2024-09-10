/**
 * Exemplo de método que utiliza variáveis para exibir informações no console.
 *
 * <p>Este método demonstra a inicialização de várias variáveis e a produção de saída no console usando essas variáveis.</p>
 *
 * @param product1 O nome do primeiro produto.
 * @param product2 O nome do segundo produto.
 * @param age A idade de uma pessoa.
 * @param code Um código de identificação.
 * @param gender O gênero representado por um caractere.
 * @param price1 O preço do primeiro produto.
 * @param price2 O preço do segundo produto.
 * @param measure Uma medida representada por um número de ponto flutuante.
 */

package introducao;

import java.util.Locale;

public class Exercicios {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        //
        System.out.println("Products:");
        System.out.printf("%s with price is $ %.2f%n", product1, price1);
        System.out.printf("%s which price is $ %.2f%n%n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.printf("%n");
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}

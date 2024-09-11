/*  ]
    Faça um programa que receba um valor e analise qual o desconto será concedido
    Considerando:
        - Se preco é menor que 20.00 então o desconto será de: 0.1
        - Senão o desconto será de 0.05
    - Recomendação: Utilise If ternário
 */
package estruturascondicionais;

public class DescontoComIFTernario {
    public static void main(String[] args) {
        double preco = 34.50;
        double descconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
        System.out.println(descconto);

    }
}

/*
Você deve criar um programa em Java que solicita ao usuário que insira um código de acesso para
obter acesso a uma área restrita. O programa deve continuar solicitando o código de acesso até que o
usuário forneça o código correto. Quando o código correto for digitado, o programa deve exibir a mensagem
"Acesso autorizado" e encerrar. Caso o código esteja incorreto, o programa deve informar "Código incorreto.
Tente novamente:"
e pedir o código novamente.
 */
package estruturascondicionais;

import java.util.Scanner;

public class CodigoDeAcessoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String codAcesso = "23t";
        System.out.println("Digite o código de acesso: ");
        String codDigitado = scan.nextLine();
        while (!codDigitado.equals(codAcesso)){
            System.out.println("Acesso negado. Digite código de acesso: ");
            codDigitado = scan.nextLine();
        }
        System.out.println("Aceso liberado.");
    }
}

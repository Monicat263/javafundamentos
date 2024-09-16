/*
    Crie um programa em Java que peça ao usuário para digitar uma senha. O programa deve continuar
    solicitando a senha até que o usuário insira a senha correta, que é "12345".
    Quando a senha correta for inserida, o programa deve exibir uma mensagem de "Acesso concedido" e encerr
 */
package estruturascondicionais;

import java.util.Scanner;

public class SenhadeAcessoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String senha = "123456";
        System.out.println("Digite sua senha: ");
        String senhaDigitada = scan.nextLine();

        while (!senhaDigitada.equals(senha)){
            System.out.println("Senha incorreta. Tente Novamente: ");
            senhaDigitada = scan.nextLine();

            }
        System.out.println("Acesso concedido");
        }
    }

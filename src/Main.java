import java.util.Scanner;

/** Objetivo: Criar uma calculadora que faz soma, multiplicação, divisão e subtração.
 *
 * 1 - Pedir dois numeros para o usuario (double) - ok
 * 2 - Apresentar uma tabela/texto para escolher a operação - ok
 * 3 - Resgatar a operação que o usuário selecionou
 * 4 - Realizar o calculo
 * 5 - Exibir resultado
 * 6 - Se a operação for inválido, exibir mensagem de erro
 * 7 - Se a divisão for por 0, exibir mensagem de erro
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1;
        double numero2;

        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        System.out.println(numero1 + numero2);
        menu();
    }

    public static String menu (){
        System.out.println("Qual operação você quer realizar:");
        System.out.println("1 - soma");
        System.out.println("2 - subtração");
        System.out.println("3 - divisão");
        System.out.println("4 - multiplicação");
        return "";
    }
}
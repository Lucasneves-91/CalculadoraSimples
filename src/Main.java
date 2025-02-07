import java.util.Scanner;

/** Objetivo: Criar uma calculadora que faz soma, multiplicação, divisão e subtração.
 *
 * 1 - Pedir dois numeros para o usuario (double)
 * 2 - Apresentar uma tabela/texto para escolher a operação
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
    }
}
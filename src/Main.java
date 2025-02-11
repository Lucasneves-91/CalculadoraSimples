import java.util.Scanner;

/** Objetivo: Criar uma calculadora que faz soma, multiplicação, divisão e subtração.
 * 1 - Pedir dois numeros para o usuario (double) - ok
 * 2 - Apresentar uma tabela/texto para escolher a operação - ok
 * 3 - Resgatar a operação que o usuário selecionou - ok
 * 4 - Realizar o calculo - ok
 * 5 - Exibir resultado - ok
 * 6 - Se a operação for inválido, exibir mensagem de erro - ok
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1;
        double numero2;
        double resultado;
        int opcao;
        String m = """
                Qual operação você quer realizar:
                1 - Soma
                2 - Subtração
                3 - Divisão
                4 - Multiplicação
                5 - Sair
                """;

        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        while (true){
            System.out.println(m);
            opcao = scanner.nextInt();
            if (opcao == 1) {
                resultado = numero1 + numero2;
                System.out.println("O resultado da soma é: " + resultado);
                break;
            } else if (opcao == 2) {
                resultado = numero1 - numero2;
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            } else if (opcao == 3) {
                resultado = numero1 / numero2;
                System.out.println("O resultado da divisão é: " + resultado);
                break;
            } else if (opcao == 4) {
                resultado = numero1 * numero2;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            }else if (opcao == 5) {
                System.out.println("Obrigado!");
                break;
            } else {
                System.out.println("Opção inválida! Escolha uma opção válida");
            }
        }


    }
}
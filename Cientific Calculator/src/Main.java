import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nEscolha a operaçao:\n");
        System.out.println("1. Soma");
        System.out.println("2. Subtraçao");
        System.out.println("3. Multiplicaçao");
        System.out.println("4. Divisao");
        System.out.println("5. Potencia");
        System.out.println("6. Raiz Quadrada");

        System.out.print("\nOperaçao: ");
        int escolha = scanner.nextInt();

        calculadoraCientifica operacao;
        double resultado = 0;

        switch (escolha) {
            case 1:
                operacao = new Soma(num1, num2);
                resultado = operacao.calcular();
                break;
            case 2:
                operacao = new Subtracao(num1, num2);
                resultado = operacao.calcular();
                break;
            case 3:
                operacao = new Multiplicacao(num1, num2);
                resultado = operacao.calcular();
                break;
            case 4:
                operacao = new Divisao(num1, num2);
                resultado = operacao.calcular();
                break;
            case 5:
                operacao = new Potencia(num1, num2);
                resultado = operacao.calcular();
                break;
            case 6:
                operacao = new RaizQuadrada(num1);
                resultado = operacao.calcular();
                break;
            default:
                System.out.println("Operação inválida!");
        }

        System.out.println("\nResultado: " + resultado);
    }
}
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contas contas = new Contas();
        boolean continuar = true;

        while (continuar) {

            System.out.println("Caso queira encerrar o programa digite Q a qualquer momento.");
            System.out.println("Digite o primeiro número:");
            contas.setNumeroUm(scanner.nextDouble());
            System.out.println("Digite o segundo número:");
            contas.setNumeroDois(scanner.nextDouble());
            scanner.nextLine();

            System.out.println(
                    "Digite qual operação você deseja fazer, soma(+),subtração(-),multiplicação(x),divisão(/),potência(^), raiz(v).");
            String operacao = scanner.nextLine();

            switch (operacao) {
                case "+":
                    double resultadoSoma = contas.somar();
                    System.out.println("Resultado adição é: " + resultadoSoma);
                    break;
                case "-":
                    double resultadoSubtracao = contas.subtracao();
                    System.out.println("Resultado da subtração é: " + resultadoSubtracao);
                    break;
                case "x":
                    double resultadoMultiplicacao = contas.multiplicacao();
                    System.out.println("Resultado da multiplicação é: " + resultadoMultiplicacao);
                    break;
                case "/":
                    if (contas.getNumeroUm() == 0 || contas.getNumeroDois() == 0) {
                        System.out.println("Impossível realizar uma divisão por zero.");
                    } else {
                        double resultadoDivisao = contas.divisao();
                        System.out.println("Resultado da divisão é: " + resultadoDivisao);
                    }
                    break;
                case "^":
                    double resultadoPotencia = contas.potencia();
                    System.out.println("Resultado da potência é: " + resultadoPotencia);
                    break;
                case "v":
                    if (contas.getNumeroUm() < 0 || contas.getNumeroDois() < 0) {
                        System.out.println("Não existe raiz de número negativo");
                    } else {
                        double resultadoRaiz = contas.raiz();
                        System.out.println("Resultado da raiz é: " + resultadoRaiz);
                    }
                    break;
                case "q":
                case "Q":
                    continuar = false;
                    break;
            }
            if (!continuar) {
                break;
            }
        }
        scanner.close();
    }
}
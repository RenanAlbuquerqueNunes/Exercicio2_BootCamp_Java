import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura (em metros): ");
        double altura = sc.nextDouble();

        System.out.print("Digite seu peso (em kg): ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade Grau III (Mórbida)");
        }

        sc.close();
    }
}
/*
 * Explicação:
 * Altura e peso são recebidos do usuário e salvos como double;
 * Fórmula do IMC: peso / (altura * altura);
 * if...else if: Verifica em qual faixa de IMC o valor calculado se encaixa;
 * printf: Mostra o valor do IMC com duas casas decimais;
 * println: Mostra a classificação do IMC.
 */
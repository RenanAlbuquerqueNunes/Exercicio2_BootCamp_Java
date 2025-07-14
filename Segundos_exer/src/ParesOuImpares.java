import java.util.Scanner;

public class ParesOuImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int fim = sc.nextInt();

        System.out.print("Deseja ver pares (P) ou ímpares (I)? ");
        char escolha = sc.next().toUpperCase().charAt(0);

        System.out.println("Números em ordem decrescente:");

        for (int i = fim; i >= inicio; i--) {
            if (escolha == 'P' && i % 2 == 0) {
                System.out.println(i);
            } else if (escolha == 'I' && i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}

/*
 * Explicação:
 * O usuário escolhe dois números (início e fim) e se quer ver pares ou ímpares;
 * O loop for percorre do fim até o início (ordem decrescente);
 * i % 2 == 0: verifica se o número é par;
 * i % 2 != 0: verifica se o número é ímpar;
 * println: exibe os números que atendem à condição escolhida.
 */
import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número base: ");
        int base = sc.nextInt();

        System.out.print("Digite quantos números deseja informar: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Informe o " + i + "º número: ");
            int valor = sc.nextInt();

            if (valor > base && valor % base == 0) {
                System.out.println(valor + " é múltiplo de " + base);
            } else {
                System.out.println(valor + " ignorado");
            }
        }

        sc.close();
    }
}

/*
 * Explicação:
 * O usuário informa um número base e quantos outros números deseja testar;
 * O for repete a leitura N vezes;
 * valor % base == 0: verifica se o número informado é múltiplo do número base;
 * valor > base: garante que só números maiores sejam considerados;
 * println: exibe a informação ou ignora o número com base na verificação.
 */

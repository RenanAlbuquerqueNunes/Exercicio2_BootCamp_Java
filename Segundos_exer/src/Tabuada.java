import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}

/*
 * Explicação:
 * (int i = 1) - Inicialização (Define a variavel de controle, normalmente um contador);
 * (i <= 10) - Condição (Enquanto for verdade, o loop continua);
 * (i++) - incremento (Atualiza a variavel de controle a cada repeticao);
 * Variavel: (numero|int) solicitamos o valor para o usuario e guardamos na variavel;
 * Formula: (numero * i) Multiplica o número informado pelo usuário com o contador i;
 * E foi utilizado o Println para melhor organizção do for, para que assim que voltar ao loop do for o proximo resultado seja printado na linha de baixo.
 */
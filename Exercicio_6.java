package TryCatch;

import java.util.Scanner;

class DadosInvalidosException extends Exception {
    public DadosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite seu nome:");
            String nome = sc.nextLine();
            System.out.println("Digite sua idade:");

            int idade = sc.nextInt();

            if (nome.isEmpty() || idade < 0) {
                throw new DadosInvalidosException("Nome vazio ou idade negativa são inválidos.");
            }
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        } catch (DadosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

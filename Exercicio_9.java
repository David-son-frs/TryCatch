package TryCatch;

import java.util.Scanner;

class TemperaturaIvalidaException extends Exception {
    public TemperaturaIvalidaException(String mensagem) {
        super(mensagem);
    }
}

public class Exercicio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Escolha a conversão que deseja fazer  :");
            System.out.println("1 C para F");
            System.out.println("2 F para C");
            int escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println("Digite a temperatura em Celsius: ");
                double temperatura = sc.nextDouble();
                double fahrenheit = (temperatura * 9 / 5) + 32;
                System.out.println(temperatura + "°C é igual a " + fahrenheit + "°F");
            } else if (escolha == 2) {
                System.out.println("Digite a temperatura em Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                double temperatura = (fahrenheit - 32) * 5 / 9;
                System.out.println(fahrenheit + "°F é igual a " + temperatura + "°C");
            } else {
                throw new TemperaturaIvalidaException("Entrada inválida");
            }

        } catch (TemperaturaIvalidaException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}

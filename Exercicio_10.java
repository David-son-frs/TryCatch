package TryCatch;
import java.util.Scanner;

class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String message) {
        super(message);
    }
}

class LimiteFatorialExcedidoException extends Exception {
    public LimiteFatorialExcedidoException(String message) {
        super(message);
    }
}

public class Exercicio_10 {

    public static int fatorial(int n) throws NumeroNegativoException, LimiteFatorialExcedidoException {
        if (n < 0) {
            throw new NumeroNegativoException("Número negativo não permitido.");
        }
        if (n > 20) {
            throw new LimiteFatorialExcedidoException("Número maior que 20 não permitido.");
        }
        if (n == 0) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        try {
            int resultado = fatorial(numero);
            System.out.println("Fatorial de " + numero + " é: " + resultado);
        } catch (NumeroNegativoException | LimiteFatorialExcedidoException e) {
            System.out.println(e.getMessage());
        }
    }
}

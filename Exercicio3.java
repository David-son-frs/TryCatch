import java.util.Scanner;

public class Exercicio3 {

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Integer number;
            System.out.println("Insira o numero desejado : ");
            number = sc.nextInt();
            double resultado = Math.sqrt(number);
            try {
                System.out.println(" A raiz quadrada do numero escolhido é " + resultado);

            } catch (IllegalArgumentException e) {
                System.out.println("Error input!");
            } finally {
                sc.close();
            }
        }
    }
}

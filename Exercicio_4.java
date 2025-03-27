import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Integer number1, number2 ;
            System.out.println("Insira um numero : ");
            number1 = sc.nextInt();
            System.out.println("Insira outro numero : ");
            number2 = sc.nextInt();
            Integer soma = number1 + number2;
            System.out.println("A soma dos dois números é : "+ soma);
            if (soma < 0) {
                throw new InputMismatchException("Entrada invalida");
            }
        }catch (InputMismatchException e){
            System.out.println("Entrada invalida");
        }finally {
            sc.close();
        }


    }
}

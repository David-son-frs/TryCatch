package TryCatch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2, resultado;
        System.out.println("Dividir : ");
        System.out.println("Entre com o primeiro numero desejado : ");
        number1 = sc.nextInt();
        System.out.println("Entre com o segundo numero desejado :");
        number2 = sc.nextInt();
        try {
            if (number2 == 0) {
                System.out.println("Não é possivel dividir por zero");
            } else {
                resultado = number1 / number2;
                System.out.println("O resultado da divisao é : " + resultado);

            }
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());


    } finally {
            sc.close();
        }
    }
}

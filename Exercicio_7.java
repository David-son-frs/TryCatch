package TryCatch;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer number1, number2, number3;

        try {
            System.out.println("Selecione o primeiro numero :");
            number1 = sc.nextInt();

            System.out.println("Selecione o segundo numero :");
            number2 = sc.nextInt();

            System.out.println("Selecione o terceiro numero : ");
            number3 = sc.nextInt();

            if (number2 == 0 || number3 == 0) {
                System.out.println("Erro : não é possivel dividir por zero.");

            } else {
                double media = (double) number1 / number2 / number3;
                System.out.println("A media é :" + media);

            }

        }catch (InputMismatchException e){
            System.out.println("Entrada invalida");
        }finally {
            sc.close();
        }
    }
}

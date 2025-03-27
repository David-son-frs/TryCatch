package TryCatch;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
    try {
        System.out.println("Insira o numero desejado :");
        number = sc.nextInt();

        if (number == 0){
            System.out.println("Valor invalido : 0 não é aceito ");
        }else{
            System.out.println("Vocé inseriu o número " + number);
        }
    }catch (NumberFormatException e){
        System.out.println("O valor inserido é invalido :");
    }
    finally {
        sc.close();
    }
    }
}

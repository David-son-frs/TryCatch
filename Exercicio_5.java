import java.util.Random;
import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Integer[] array = {1,2,3,4,5,6,7,8,9,10};
            System.out.println("Solicite um indice : ");
            Integer index = sc.nextInt();
            System.out.println(array[index]);

        }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Posiçao não encontrada");
    }finally {
            sc.close();
        }
    }
}

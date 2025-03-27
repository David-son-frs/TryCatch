import java.util.Scanner;

public class Exercicio3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            try {
                System.out.println("Insira o numero desejado : ");
                Integer number = sc.nextInt();
                if (number < 0) {
                    throw new IllegalArgumentException("Entrada invalida");
                }
                double resultado = Math.sqrt(number);
                System.out.println(" A raiz quadrada do numero escolhido é " + resultado);
                } catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                } finally{
                    sc.close();
                }
            }
        }

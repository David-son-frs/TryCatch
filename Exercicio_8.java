package TryCatch;

import java.util.Scanner;

class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}
public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer idade;
        try {
            System.out.println("Digite sua idade");
            idade = sc.nextInt();

            if(idade > 18){
                throw  new IdadeInvalidaException("ERRO ! essa pessoa é maior de 18 anos ");
            }else{
                System.out.println("Essa pessoa é menor de idade ");
            }
        }catch (IdadeInvalidaException e){
            System.out.println("Entrada invalida, Essa pessoa é maior de 18 .");
        }finally {
            sc.close();
        }
    }
}

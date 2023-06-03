package ExerciciosArrays;
// 6. Crie um programa para verificar se o inteiro fornecido é um múltiplo de 5 e 7.
import java.util.Scanner;

public class Multiplo5E7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] numero = new int[1];
        System.out.println("DIGITE UM NUMERO: ");
        numero[0] = entrada.nextInt();

        if(numero[0] % 5 == 0 && numero[0] % 7 == 0) {
            System.out.println("É múltiplo de 5 e de 7 ");
        } else if (numero[0] % 5 == 0){
            System.out.println("É múltiplo apenas de 5.");
        } else if(numero[0] % 7 == 0) {
            System.out.println("É múltiplo apenas de 7. ");
        } else {
            System.out.println("Não é múltiplo nem de 5 e nem de 7.");
        }


    }
}

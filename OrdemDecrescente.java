package ExerciciosArrays;
import java.util.Arrays;
import java.util.Scanner;

// 3. Peça ao usuário dois números e exiba em ordem decrescente (suponha números diferentes).
public class OrdemDecrescente {
    public static void main(String[] args) {
        int [] numeros = new int[2];
        Scanner entrada = new Scanner(System.in);
        System.out.println("ADICIONE O PRIMEIRO NÚMERO: ");
        numeros[0] = (entrada.nextInt());
        System.out.println("ADICIONE O SEGUNDO NÚMERO: ");
        numeros[1] = (entrada.nextInt());

        for (int i = 0; i < 2; i++) {
            if (numeros[0] == numeros[1]) {
                System.out.println("Digite números diferentes entre si");
                return;
            } else {
                break;
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("A ORDEM DECRESCENTE É: ");
        System.out.println("-------------------------------------");
        if(numeros[0] > numeros[1]) {
            System.out.println(numeros[0]);
            System.out.println(numeros[1]);
        } else {
            System.out.println(numeros[1]);
            System.out.println(numeros[0]);

        }
    }
}

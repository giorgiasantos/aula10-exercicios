package ExerciciosArrays;
import java.util.*;

// 7. Crie um programa para exibir o inteiro fornecido pelo usuário na ordem inversa.
public class OrdemInversa {
    public static void main(String[] args) {
        List <Integer> listaDeNumeros = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < 5;i++) {
            System.out.println("DIGITE UM NUMERO");
            int numeroUsuario = entrada.nextInt();
            listaDeNumeros.add(numeroUsuario);
            //System.out.println(listaDeNumeros);
        }
        System.out.println("Ordem original: " + listaDeNumeros);
        Collections.reverse(listaDeNumeros);
        System.out.println("Ordem reversa: " + listaDeNumeros);

    }
}

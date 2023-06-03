package ExerciciosArrays;

import java.lang.reflect.Array;

// 12. Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo que nos vetor B e C serão armazenados o valores pares e ímpares de A, respectivamente.
public class VetoresABC {
    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println("O VETOR ORIGINAL É: ");
        for (int i = 0; i < 20; i++) {
            System.out.println(vetorA[i]);
        }
        int[] vetorPares = vetorA.clone();
        System.out.println("-------------------------------------");
        System.out.println("O VETOR B COM NÚMEROS PARES É: ");
        int soma = 0;
        for (int i = 0; i < vetorPares.length; i++) {
            if (vetorPares[i] % 2 == 0) {
                soma++;
                System.out.println(vetorPares[i]);
            } else {

            }

        }

        int[] vetorImpares = vetorA.clone();
        System.out.println("-------------------------------------");
        System.out.println("O VETOR C COM NÚMEROS IMPARES É: ");
        for (int i = 0; i < vetorPares.length; i++) {
            if (vetorImpares[i] % 2 != 0) {
                soma++;
                System.out.println(vetorImpares[i]);
            } else {

            }


        }
    }
}


package ExerciciosArrays;
// 11. Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.

public class VetorIdades {
    public static void main(String[] args) {
    int [] idades = {15,12,13,31,20,54,33,25,29,43};
    int maior = 0;
    int menor = Integer.MAX_VALUE;

    System.out.println("AS IDADES SÃO: ");
    for (int i = 0; i < 10; i++) {
        System.out.println(idades[i]);

        if(idades[i] < menor) {
            menor = idades[i];
        }else if (idades[i] > maior) {
            maior = idades[i];
        }

    }
        System.out.println("-------------------------------");
    System.out.println("O maior número é " + maior);
    System.out.println("O mmenor número é " + menor);


    }
}

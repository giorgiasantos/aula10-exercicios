package ExerciciosArrays;
// 10. Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a média aritmética simples dos elementos ímpares armazenados neste vetor.
public class SomaVetor {
    public static void main(String[] args) {
    int [] vetorA = {1,2,3,4,5,6,7,8,9,10};
    int soma = 0;
    System.out.println("O VETOR COMPLETO É: ");
    for(int i = 0; i < 10; i++) {
        System.out.println(vetorA[i]);
        if (vetorA[i] % 2 != 0) {
            soma += vetorA[i];
            //System.out.println(soma);
        } else {
            //System.out.println("-");
        }

    }
    int media = soma / 5;
    System.out.println("A média da soma dos números ímpares do vetor é: " + media);


    }
}

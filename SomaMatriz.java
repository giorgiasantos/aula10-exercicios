package ExerciciosArrays;

import java.util.Scanner;
// 9. Crie um programa para exibir a soma de 20 números usando uma matriz.
public class SomaMatriz {
    public static void main(String[] args) {
        int [][] matriz = new int[10][2];
        Scanner entrada = new Scanner(System.in);
        Integer soma = 0;

        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz[linha].length; coluna++)
            {
                System.out.println("DIGITE UM NÚMERO: ");
                matriz[linha][coluna] = entrada.nextInt();
                soma += matriz[linha][coluna];
            }

        }

        System.out.println(soma);

    }
}

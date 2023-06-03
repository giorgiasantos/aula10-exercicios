package ExerciciosArrays;
//// 8. Crie um programa para exibir todos os inteiros dentro do intervalo 100-150 cuja soma de todos os dígitos é um número par.
public class SomaIntervalo {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 100; i < 150; i++) {

            int primeiraUnidade = (i % 10);
            int segundaUnidade = (i % 100) / 10;
            int terceiraUnidade = (i / 100);
            soma = (primeiraUnidade + segundaUnidade + terceiraUnidade);

            if (soma % 2 == 0) {
                System.out.println(i + " : A soma dos dígitos é = " + soma);
            }

        }
    }
}
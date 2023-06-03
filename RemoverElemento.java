package ExerciciosArrays;
import java.util.List;
import java.util.ArrayList;

// 1. Escreva um programa para remover um elemento específico de uma lista.
public class RemoverElemento {
    public static void main(String[] args) {

        List<String> dias = new ArrayList<>();
        System.out.println("TODOS OS DIAS DA SEMANA: ");
        dias.add("Segunda-feira");
        dias.add("Terça-feira");
        dias.add("Quarta-feira");
        dias.add("Quinta-feira");
        dias.add("Sexta-feira");
        dias.add("Sábado");
        dias.add("Domingo");
        System.out.println("Tamanho da lista = " + dias.size());
        System.out.println("----------------------------------");

        for(int i = 0; i < dias.size(); i++) {
            System.out.println(dias.get(i));
            dias.remove("Segunda-feira");
        }
        System.out.println(" ");
        System.out.println("DIAS DA SEMANA SEM A SEGUNDA-FEIRA: ");
        System.out.println("----------------------------------");
        for(int x = 0; x < dias.size(); x++) {

            System.out.println(dias.get(x));
        }
        System.out.println("Tamanho da lista = " + dias.size());
    }
}

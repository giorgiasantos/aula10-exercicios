package ExerciciosArrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 2. Escreva um programa para inserir um elemento (posição específica) em uma lista.
public class AdicionarElemento {
    public static void main(String[] args) {
        List<String> listaDeCompras = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("COMPRAR 5 FRUTAS DIFERENTES");
        listaDeCompras.add("Maçã");
        listaDeCompras.add("Banana");
        listaDeCompras.add("Laranja");
        listaDeCompras.add("Morango");
        for(int i = 0;i < listaDeCompras.size(); i++) {
            System.out.println(listaDeCompras.get(i));
        }
        System.out.println("?");

        for(int i = 0; i < 1; i++) {
            System.out.println("ADICIONE O QUINTO ITEM DA SUA LISTA DE COMPRAS: ");
            String itemLista = entrada.next();
            listaDeCompras.add(itemLista);
        }
        System.out.println(listaDeCompras);


    }
}

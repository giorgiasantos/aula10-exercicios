package ExerciciosArrays;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.LongAccumulator;

// 5. Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
public class MediaSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Map<String, Integer> lista = new HashMap<>();
        System.out.println("DIGITE A QUANTIDADE DE FUNCIONÁRIOS: ");
        Integer quantidade = entrada.nextInt();
        Integer salario = 0;
        Integer soma = 0;
        Integer media = 0;

        for(int i = 0; i < quantidade; i++) {
            System.out.println("DIGITE O FUNCIONÁRIO: ");
            String nome = entrada.next();
            System.out.println("DIGITE O SALÁRIO: ");
            salario = entrada.nextInt();
            lista.put(nome,salario);
            //System.out.println(lista);
        }

        for(String key: lista.keySet()){
            soma = soma + lista.get(key);

        }

        media = soma/quantidade;

        System.out.println("A média dos salários é = " + media);









    }
}

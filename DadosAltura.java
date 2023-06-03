package ExerciciosArrays;
//// 4. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
////a. a maior e a menor altura do grupo;
////b. média de altura dos homens;
////c. o número de mulheres.

import java.util.HashMap;
import java.util.Map;

public class DadosAltura {
    public static void main(String[] args) {
        Map<String,Double> listaPessoas = new HashMap<>();
        listaPessoas.put("Mulher1", 1.60);
        listaPessoas.put("Mulher2", 1.56);
        listaPessoas.put("Mulher3", 1.68);
        listaPessoas.put("Mulher4", 1.71);
        listaPessoas.put("Homem1", 1.82);
        listaPessoas.put("Homem2", 1.80);
        listaPessoas.put("Homem3", 1.70);
        listaPessoas.put("Homem4", 1.77);
        listaPessoas.put("Homem5", 1.65);
        listaPessoas.put("Homem6", 1.93);

        double maiorAltura = 0;
        double menorAltura = Integer.MAX_VALUE;
        double mediaAltura = 0;
        double qtdeM = 0;

        for (String key : listaPessoas.keySet()) {
            //System.out.println(listaPessoas.get(key));
            if (listaPessoas.get(key) > maiorAltura) {
                maiorAltura = listaPessoas.get(key);
            } else if (listaPessoas.get(key) < menorAltura) {
                menorAltura = listaPessoas.get(key);
            }
        }
        System.out.println("A menor altura entre os homens é :" + menorAltura);
        System.out.println("A maior altura entre os homens é :" + maiorAltura);


    }
}

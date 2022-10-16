package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
  Faça um programa que simule um lançamento de dados.
  Lance o dado 100 vezes e armazene.
  Depois, mostre quantas vezes cada valor foi conseguido.
*/
public class ex2_dados {
  public static void main(String[] args) {
    Integer quantidadeLancamentos = 100;

    List<Integer> lancamentos = new ArrayList<>();
    Random numeros = new Random();
    Map<Integer, Integer> vezes = new HashMap<>();
    
    for(int i = 1; i < quantidadeLancamentos +1 ; i++){
      // 6 pq o dado tem 6 lados e +1 para que não apareca o 0
      Integer item = numeros.nextInt(6) + 1;
      lancamentos.add(item);
      if(vezes.containsKey(item)) vezes.put(item, (vezes.get(item)) + 1);
      else vezes.put(item, 1);
    }
    System.out.println(lancamentos + "\n\n");
    System.out.println(vezes + "\n\n");
  }
}


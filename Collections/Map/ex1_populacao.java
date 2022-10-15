package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
  Dada a população estimada de alguns estados do nordeste brasileiro, faça:
  Estado = PE - população = 9.616.621
  Estado = AL - população = 3.351.543
  Estado = CE - população  = 9.187.103
  Estado = RN - população = 3.534.265
*/


public class ex1_populacao {
  public static void main(String[] args) {
    System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
    Map<String, Integer> estados = new HashMap<>() {{
      put("PE", 9616621);
      put("AL", 3351543);
      put("CE", 9187103);
      put("RN", 3534265);
    }};
    System.out.println(estados + "\n\n");


    System.out.println("Substitua a população do estado RN por : 3.534.165");
    estados.put("RN", 3534165);
    System.out.println(estados + "\n\n");


    System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione PB - 4.039.277: ");
    if(estados.containsValue("PB")) System.out.println("Contém");
    else estados.put("PB", 4039277); System.out.println("Não contém - Adicionando");
    System.out.println(estados + "\n\n");


    System.out.println("Exiba a população do estado PE: ");
    System.out.println("PE: " + estados.get("PE") + "\n\n");


    System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
    Map<String, Integer> estadosInformados = new LinkedHashMap<>(){{
      put("PE", 9616621);
      put("AL", 3351543);
      put("CE", 9187103);
      put("RN", 3534265);
    }};
    System.out.println(estadosInformados + "\n\n");


    System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
    Map<String, Integer> estadosAlfabetica = new TreeMap<>(estados);
    System.out.println(estadosAlfabetica + "\n\n");


    System.out.println("Exiba o Estado com a menor e maior população e seus respectivos valores");
    Collection<Integer> populacao = estados.values();
    String maior = "";
    String menor = "";
    for (Map.Entry<String, Integer> entry : estados.entrySet()) {
      if (entry.getValue().equals(Collections.max(populacao))) maior = entry.getKey();
      if (entry.getValue().equals(Collections.min(populacao))) menor = entry.getKey();
    }
    System.out.printf("Menor (%s)(%d) \nMaior (%s)(%d)", menor, Collections.min(populacao), maior, Collections.max(populacao));
    System.out.println("\n\n");
    
    
    System.out.println("Exiba a soma da população desses estados: ");
    Integer soma = 0;
    Iterator<Integer> iterator = estados.values().iterator();
    while(iterator.hasNext()){
      soma += iterator.next();
    }
    System.out.println("Soma = " + soma + "\n\n");
    /*int soma2 = 0;
      for(Map.Entry<String, Integer> entry : populaçãoEstadosNE.entrySet()) {
      soma2 += entry.getValue();
      }
    */


    System.out.println("Exiba a média da população deste dicionário de estados: " );
    System.out.println("Media = " + soma/estados.size() + "\n\n");
    

    System.out.println("Remova os estados com a população menor que 4.000.000: ");
    System.out.println(estados);
    Iterator<Integer> iterator2 = estados.values().iterator();
    while(iterator2.hasNext()){
      if(iterator2.next() < 4000000) iterator2.remove();
    }
    System.out.println(estados + "\n\n");


    System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
    estados.clear();
    System.out.println(estados + "\n\n");

    
    System.out.println("Confira se a lista está vazia: " + estados.isEmpty() + "\n\n");
  }
}

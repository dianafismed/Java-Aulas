package Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
 public static void main(String[] args) {
  /*        Formas de inicializar um set:
  Set notas = new HashSet(); //antes do java 5
  HashSet<Double> notas = new HashSet<>();
  Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
  
  Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
  notas.add(1d);
  notas.remove(5d);
  System.out.println(notas);
  */

  /*   O que faremos:
   Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
  */
  System.out.println("Crie um conjunto e adicione as notas: [7, 8.5, 9.3, 5, 7, 0, 3.6]");
  Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
  System.out.println(notas.toString() + " \n");
  /* 
    A resposta foi [0.0, 8.5, 3.6, 5.0, 9.3, 7.0]
    O set não aceita valores duplicados e não possui índice.
    Os valores atribuídos são dispostos de forma aleatória
  */

  System.out.println("Exiba a posição da nota 5.0: ");
  System.out.println("Como a lista é aleatória, não é possível encontrar a posição de um elemento \n\n");

  System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
  System.out.println("Novamente, como a lista é aleatória, não é possível encontrar a posição de um elemento \n\n");

  System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
  System.out.println("Novamente, como a lista é aleatória, não é possível encontrar a posição de um elemento \n\n");

  System.out.println("Confira se a nota 5.0 está no conjunto: ");
  System.out.println("Resposta:  " + notas.contains(5d) + " \n\n");

  System.out.println("Exiba a terceira nota adicionada: ");
  System.out.println("Novamente, como a lista é aleatória, não é possível encontrar a posição de um elemento \n\n");

  System.out.println("Exiba a menor nota: ");
  System.out.println("Menor nota: " + Collections.min(notas) + " \n\n");

  System.out.println("Exiba a maior nota: ");
  System.out.println("Maior nota: " + Collections.max(notas) + " \n\n");

  System.out.println("Exiba a soma dos valores: ");
  System.out.println("Tenho que fazer por iterator, pq o set não tem o método get. A soma será menor pq set não permite valor repetido");
  Iterator<Double> iterator = notas.iterator();
  Double soma = 0.0;
  while(iterator.hasNext()) {
    Double next = iterator.next();
    soma += next;
  }
  System.out.println("Soma: " + soma + " \n\n");
  
  System.out.println("Exiba a média das notas: ");
  System.out.println("Média: " + (soma/ notas.size()) + " \n\n");

  System.out.println("Remova a nota 0: ");
  notas.remove(0d);
  System.out.println(notas + " \n\n");

  System.out.println("Remova a nota da posição 0");
  System.out.println("Novamente, como a lista é aleatória, não é possível encontrar a posição de um elemento \n\n");
  
  System.out.println("Remova as notas menores que 7 e exiba a lista: ");
  Iterator<Double> iterator1 = notas.iterator();
  while(iterator1.hasNext()){
    Double next = iterator1.next();
    if (next < 7) iterator1.remove();
  }
  System.out.println(notas + " \n\n");

  System.out.println("Exiba todas as notas na ordem em que foram informados: ");
  Set<Double> notas2 = new LinkedHashSet<>();
  notas2.add(7d);
  notas2.add(8.5);
  notas2.add(9.3);
  notas2.add(5d);
  notas2.add(7d);
  notas2.add(0d);
  notas2.add(3.6);
  System.out.println(notas2 + " \n\n");
  
  System.out.println("Exiba todas as notas na ordem crescente: ");
  Set<Double> notas3 = new TreeSet<>(notas2);
  System.out.println(notas3 + " \n\n");
  Set<Double> notas4 = new TreeSet<>(notas);
  System.out.println(notas4 + " \n\n");

  System.out.println("Apague todo o conjunto");
  notas.clear();
  System.out.println(" \n\n");
  System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
  System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
  System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());
  System.out.println(" \n\n");
 } 
}

package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class ExemploList {
    public static void main(String[] args) {
      /*Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
        Crie uma lista e adicione as sete notas:
        Formas:
        List notas = new ArrayList(); //antes do java 5
        ArrayList<Double> notas = new ArrayList<>();
        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        
        List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); Lista imutável, não add nem remove
        notas.add(10d);
        System.out.println(notas);
      
        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);  Lista imutável, não add nem remove
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
      */

      /* Forma escolhida - Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça: */
      System.out.println("1 - Crie uma lista e adicione as sete notas: ");
      
      // Gerando a lista -  Generics(jdk 5) - Diamond Operator(jdk 7)
      List<Double> notas = new ArrayList<Double>();
      // Populando a lista
      notas.add(7.0);
      notas.add(8.5);
      notas.add(9.3);
      notas.add(5.0);
      notas.add(7.0);
      notas.add(0.0);
      notas.add(3.6);
      // Imprimindo a lista
      System.out.println(notas);
      System.out.println(notas.toString());


      System.out.println("\n");


      System.out.println("2 - Exiba a posição da nota 5.0");
      System.out.println("Posição: " + notas.indexOf(5d));
      

      System.out.println("\n");


      System.out.println("3 - Adicione na lista a nota 8.0 na posição 4: ");
      notas.add(4, 8d);
      System.out.println(notas);


      System.out.println("\n");


      System.out.println("4 - Substitua a nota 5.0 pela nota 6.0: ");
      notas.set(notas.indexOf(5d), 6.0);
      System.out.println(notas);


      System.out.println("\n");


      System.out.println("5 - Confira se a nota 5.0 está na lista");
      System.out.println("5.0 está na lista ? :  " + notas.contains(5d));
      

      System.out.println("\n");


      System.out.println("6 - Exiba todas as notas na ordem em que foram informados: ");
      System.out.println("Como é uma lista, os elementos, qdo impressos de forma simples, são mostrados conforme foram inseridos");
      System.out.println(notas);
      for (Double nota : notas) System.out.println(nota);


      System.out.println("\n");


      System.out.println("7 - Exiba a terceira nota adicionada");
      System.out.println("A terceira nota adicionada é: " + notas.get(2));
      

      System.out.println("\n");


      System.out.println("8 - Exiba a menor nota: ");
      System.out.println("Menor nota: " + Collections.min(notas));


      System.out.println("\n");


      System.out.println("9 - Exiba a maior nota: ");
      System.out.println("Maior nota: " + Collections.max(notas));


      System.out.println("\n");


      System.out.println("10 - Exiba a soma dos valores: ");
      // via while
      Iterator<Double> iterator = notas.iterator();
      Double soma = 0d;
      while(iterator.hasNext()){
        Double next = iterator.next();
        soma += next;
      }
      System.out.println("Soma via while com iterator: " + soma);
      // via for
      Double total = 0d;
      for(int i = 0; i < notas.size(); i++){
        total = total + notas.get(i);
      }
      System.out.println("Soma via for: " + total);


      System.out.println("\n");


      System.out.println("11 - Exiba a média das notas: ");
      System.out.println("Média com o resultado do while: " + (soma/notas.size()));
      System.out.println("Média com o resultado do for: " + (total/notas.size()));


      System.out.println("\n");


      System.out.println("12 - Remova a nota 0: ");
      notas.remove(0d);
      System.out.println(notas);


      System.out.println("\n");
      

      System.out.println("13 - Remova a nota da posição 0");
      notas.remove(0);
      System.out.println(notas);


      System.out.println("\n");
       

      System.out.println("14 - Remova as notas menores que 7 e exiba a lista: ");

      Iterator<Double> iterator1 = notas.iterator();
      // via while
      while(iterator1.hasNext()) {
          Double next = iterator1.next();
          if(next < 7) iterator1.remove();
      }
      System.out.println(notas);
      // via for
      for(int valor=0; valor<notas.size(); valor++){
        if(notas.get(valor)< 7.0){
          notas.remove(valor);
        }
      }
      System.out.println(notas);


      System.out.println("\n");
 

      System.out.println("15 - Apague toda a lista");
      notas.clear();
      System.out.println(notas);
      

      System.out.println("\n");
      
      
      System.out.println("16 - Confira se a lista está vazia:");
      System.out.println("Está vazia?   " + notas.isEmpty());


      System.out.println("\n");
  }
}
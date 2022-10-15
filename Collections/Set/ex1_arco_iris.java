package Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
  Crie uma conjunto contendo as cores do arco-íris e:
  a) Exiba todas as cores o arco-íris uma abaixo da outra;
  b) A quantidade de cores que o arco-íris tem;
  c) Exiba as cores em ordem alfabética;
  d) Exiba as cores na ordem inversa da que foi informada;
  e) Exiba todas as cores que começam com a letra ”v”;
  f) Remova todas as cores que não começam com a letra “v”;
  g) Limpe o conjunto;
  h) Confira se o conjunto está vazio;
*/
public class ex1_arco_iris {
  public static void main(String[] args) {
    System.out.println(" Crie uma conjunto contendo as cores do arco-íris");
    Set<String> arcoIris = new HashSet<>();
    arcoIris.add("Vermelho");
    arcoIris.add("Laranjado");
    arcoIris.add("Amarelo");
    arcoIris.add("Verde");
    arcoIris.add("Azul");
    arcoIris.add("Anil");
    arcoIris.add("Violeta");
    System.out.println("a) As cores do arco íris são: " + arcoIris + " \n");


    System.out.println("a) Exiba todas as cores o arco-íris uma abaixo da outra");
    for(String cor: arcoIris) System.out.println(cor);
    System.out.println(" \n\n");


    System.out.println("b) A quantidade de cores que o arco-íris tem;");
    System.out.println("O arco íris tem " + arcoIris.size() + " cores \n\n");


    System.out.println("c) Exiba as cores em ordem alfabética");
    Set<String> arcoIrisOrdenado = new TreeSet<>(arcoIris);
    System.out.println(arcoIrisOrdenado + " \n\n");


    System.out.println("d) Exiba as cores na ordem INVERSA da que foi informada");
    Set<String> arcoIrisInformado = new LinkedHashSet<>(Arrays.asList("Vermelho","Laranjado","Amarelo","Verde","Azul","Anil","Violeta"));
    List<String> inverso = new ArrayList<>(arcoIrisInformado);
    Collections.reverse(inverso);
    System.out.println(inverso + "\n\n");

    System.out.println("e) Exiba todas as cores que começam com a letra V ");
    for(String cor: arcoIris){
      if ((cor.startsWith("v")) || (cor.startsWith("V"))) System.out.println(cor);
    }
    System.out.println("\n\n");
    

    System.out.println("f) Remova todas as cores que não começam com a letra V;");
    Iterator<String> iterator = arcoIris.iterator();
    while(iterator.hasNext()){
      if(iterator.next().startsWith("V")) iterator.remove();
    }
    System.out.println(arcoIris + "\n\n");


    System.out.println("g) Limpe o conjunto;");
    arcoIris.clear();
    System.out.println(arcoIris + "\n\n");


    System.out.println("h) Confira se o conjunto está vazio");
    System.out.println(arcoIris.isEmpty() + "\n\n");
  }
}

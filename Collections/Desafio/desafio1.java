package Desafio;

/*
  Dado uma array de valores {2, 3, 5, 7, 11, 13, 18, 34}.
  Desenvolva um programa que retorne como resultado apenas os números pares dessa array.
*/
public class desafio1 {
  public static void main(String[] args) {
    int lista[] = {2, 3, 5, 7, 11, 13, 18, 34};
    System.out.println(lista);

    for(Integer i : lista){
      if(i%2 == 0) System.out.println(i);
    }
  }
}

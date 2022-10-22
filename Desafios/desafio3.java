

import java.util.Scanner;

/*
 Faça um programa que leia um valor T e preencha um vetor N[1000] com a sequência de
 valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo.

 Imprima o vetor N.
*/

public class desafio3 {
  public static void main(String[] args) {
    try (Scanner leitor = new Scanner(System.in)) {
    }
    //int t = leitor.nextInt();
    //int N[] = {};
    Integer t = 3;
    
    Integer i = 0;
    while(i < 1000){
      for(int j = 0; j < t ; j++){
        if(i<1000) System.out.println("N[" +  i  + "] = " + j );
        i++;
      }
    }
  }
}


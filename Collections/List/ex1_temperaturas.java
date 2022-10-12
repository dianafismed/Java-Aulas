/*
1 - Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
2 - Após isto, calcule a média semestral das temperaturas.
3 - Mostre todas as temperaturas acima desta média e em que mês elas ocorreram 
    (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex1_temperaturas {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    List<Double> temperaturas = new ArrayList<Double>();
    Double soma = 0d;

    System.out.println("Digite o valor da tempetatura: ");
    for(int i = 0; i < 6 ; i++){
      System.out.println("Mês " + (i+1) + ": ");
      // Recebendo os dados que o usuário digita
      Double temperatura = scan.nextDouble();
      // Inserindo a temperatura digitada na lista de temperaturas
      temperaturas.add(temperatura);
      soma += temperaturas.get(i);
    }
    System.out.println(temperaturas + " \n");

    // Fazendo a média das temperaturas
    Double media = (soma/temperaturas.size());
    System.out.printf("Média das temperaturas: %.2f\n\n", media);

    // Verificando quais as temperaturas maiores que a média e mostrando o mês correspondente
    System.out.println("Temperaturas maiores que a média");
    for (int y = 0; y < 6 ; y++){
      double temp = temperaturas.get(y);
      if (temp > media){
        switch (y){
          case 1: System.out.println("Janeiro - " + temp); break;
          case 2: System.out.println("Fevereiro - " + temp); break;
          case 3: System.out.println("Março - " + temp); break;
          case 4: System.out.println("Abril - " + temp); break;
          case 5: System.out.println("Maio - " + temp); break;
          case 6: System.out.println("Junho - " + temp); break;
          default: System.out.println("Não houve temperatura acima da média"); break;
        }
      }
    }

    
  }  
}

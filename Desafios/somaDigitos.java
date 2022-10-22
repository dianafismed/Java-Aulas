import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
  Dado um inteiro positivo num, retorne o número de inteiros positivos menor ou igual a num cuja soma de dígitos é par.
  A soma dos dígitos de um inteiro positivo é a soma de todos os seus dígitos.
*/


public class somaDigitos {
  public static void main(String[] args) {
    Integer num = Integer.parseInt(new Scanner(System.in).nextLine());
    Integer count = 0;

    for(int i=0; i<=num; i++){
      var strNum = String.valueOf(i);
      if(strNum.length()==1){
        if(i%2 == 0 && i!=0) count ++; continue;
      }
      char[] vs = strNum.toCharArray();
      var sum = 0;
      for(int j=0; j< vs.length; j++){
        sum += (int)Character.getNumericValue(vs[j]);
      }
      if (sum % 2 == 0) count++;
    }
    System.out.println(count);


    // Integer count = 0;
    // List<Integer> lista = new ArrayList<>();
    // lista.add(num); 
    // var strNum = String.valueOf(num);
    // for(int i=0; i<=num; i++){
    //   lista.add(i);
    //   var digitos = String.valueOf(i);
    //   if(strNum.length()==1){
    //     if(num %2 == 0 ){
    //       while(num>1){
    //         num /=2;
    //         count++;
    //       }
    //     } 
    //   }
    //   else{

    //     // char vs [] = strNum.toCharArray();
    //     // System.out.println(vs);
    //     //System.out.println(digitos);
    //   }
    //   System.out.println(digitos);
    // }
    // System.out.println("Lista - " + lista);
    // System.out.println("Contagem - " + count);
  }
}


// char[] vs = strNum.toCharArray();
      // var sum = 0;
      // for (var j = 0; j < vs.length; j++) sum += (int)Character.getNumericValue(vs[j]);
      // if (sum % 2 == 0) count++;
    // for(int i=0; i<digito.length(); i++){
    //   char ch = digito.charAt(i);
    //   System.out.println(ch);
    // }



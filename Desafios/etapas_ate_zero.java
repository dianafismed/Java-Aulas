import java.util.Scanner;

/*
  Dado um inteiro x, retorne o número de etapas para reduzi-lo a zero.
  Em uma etapa, se o número atual for par, você deve dividi-lo por 2, caso contrário, você deve subtrair 1 dele.
*/


public class etapas_ate_zero {
  public static void main(String[] args) {
  Integer num = Integer.parseInt(new Scanner(System.in).nextLine());
  Integer step = 0;

  while(num > 0){
    if(num % 2 == 0)num /= 2; 
    else num-- ;
    step ++;
  }
  System.out.println(step);
 } 
}

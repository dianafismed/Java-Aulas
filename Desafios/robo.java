import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
  Em um jogo 2D existe um robô de limpeza que começa na posição (0,0).
  Ele recebe alguns comandos através de uma sequência de movimentos.
  Os movimentos válidos são:  'W' (movimento para cima),
                              "S"(movimento para baixo), 
                              "D"(movimento para direita) e 
                              "A"(movimento para esquerda).
  Você deverá verificar se após completar seus movimentos o robô se encontra na posição (0,0).
  Retorne true se o robô retornar à origem ou false caso contrário.
  Assuma que a magnitude do movimento do robô é a mesma para cada movimento.
*/

public class robo {
  public static void main(String[] args) {
    String possiveis[] = {"a", "d", "s", "w"};
    List<String> listademovimentos = new ArrayList<>();
    for (String item: possiveis){
      for(String item2: possiveis){
        listademovimentos.add(item+item2);
      }
    }

    Integer x = 0;
    Integer y = 0;    
    
    // Lê o que o usuário digitou
    //Leitor();
    String continua = "sim";

    while(continua == "sim"){
      String leitor = Leitor();
      if(listademovimentos.contains(leitor)){
        for(int i=0; i<2; i++){
          char ch = leitor.charAt(i);
          switch (ch) {
            case 'w': x++; break;
            case 's': x--; break;
            case 'd': y++;break;
            case 'a': y--; break;
            default: break;
          }
        }
        continua = "nao";
        if(x==0 && y==0) System.out.println(true);
        else System.out.println(false);
      }
      else continua = "sim";
    }
     
  }

  public static String Leitor() {
    System.out.println("Movimentos válidos -   W (cima)     S (baixo)     D (direita)     A(esquerda)\n");
    System.out.println("Digite duas letras (2 movimentos):  ");
    String leitor = new Scanner(System.in).nextLine().toLowerCase();
    return leitor;
  }

}





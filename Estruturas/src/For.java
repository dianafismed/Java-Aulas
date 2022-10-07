public class For {
  public static void main(String[] args) {
    //estrutura 1
    // for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
    //   System.out.println(carneirinhos + " - Carneirinho(s)");
    // }

    //estrutura 2
    //o que importa é somente o bloco condicional
    // int carneirinhos = 1;
    // for( ; carneirinhos <=20; ) {
    //   System.out.println(carneirinhos + " - Carneirinho(s)");
    //   carneirinhos ++;
    // }

    
    String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
    // forma comum
    for (int x=0; x<alunos.length; x++) {
      System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
    }
    // forma abreviada / ternária
    for(String aluno : alunos) {
      System.out.println(alunos);
    }










	}
}

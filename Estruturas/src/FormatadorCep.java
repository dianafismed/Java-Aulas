public class FormatadorCep {
  public static void main(String[] args) {
    try {
      String cepFormatado = formatarCep("237650");
      System.out.println(cepFormatado);
    } catch (Excecoes2 e) {
      //e.printStackTrace();
      System.out.println("O cep não está correto");
    }
  }
  static String formatarCep(String cep) throws Excecoes2{
    if(cep.length() != 8)
      throw new Excecoes2();
      return "23.765-064";
  }
}

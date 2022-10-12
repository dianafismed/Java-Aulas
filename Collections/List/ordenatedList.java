import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Dadas as seguintes informações sobre meus gatos, crie uma lista e ordene esta lista exibindo:
(nome - idade - cor);
Gato 1 = nome: Jon,   idade: 18,  cor: preto
Gato 2 = nome: Simba, idade: 6,   cor: tigrado
Gato 3 = nome: Jon,   idade: 12,  cor: amarelo

1º Passo:  Criar a classe Gato e seus atributos
2º Passo:  Criar a lista que receberá os dados dos gatos

*/

public class ordenatedList {
  public static void main(String[] args) {
    // Criando a lista do passo 2
    List<Gato> meusGatos = new ArrayList<>(){{
      // Já populando a lista dentro da criação da lista
      add(new Gato("Jon", 12, "preto"));
      add(new Gato("Simba", 6, "tigrado"));
      add(new Gato("Jon", 18, "amarelo"));
      add(new Gato("Satine", 12, "escaminha"));
      add(new Gato("Satã", 11, "preto"));
      add(new Gato("Morgana", 9, "siamês"));
      add(new Gato("Gaia", 4, "tigrada"));
    }};
    System.out.println(meusGatos);
    //       meusGatos.sort(Comparator.comparing(Gato::getNome));


    System.out.println("\n");


    System.out.println("1 - Mostrar pela ordem de inserção: ");
    System.out.println(meusGatos);

    
    System.out.println("\n");


    System.out.println("2 - Mostrar de forma aleatória: ");
    Collections.shuffle(meusGatos);
    System.out.println(meusGatos);


    System.out.println("\n");


    System.out.println("3 - Mostrar pela ordem Natural pelo nome");
    Collections.sort(meusGatos);
    System.out.println(meusGatos);


    System.out.println("\n");


    System.out.println("4 - Mostrar por ordem de idade");
    // 1 forma
    Collections.sort(meusGatos, new ComparatorIdade());
    System.out.println(meusGatos);
    // 2 forma
    meusGatos.sort(new ComparatorIdade());
    System.out.println(meusGatos);


    System.out.println("\n");


    System.out.println("5 - Mostrar por ordem de cor");
    // 1 forma
    Collections.sort(meusGatos, new ComparatorCor());
    System.out.println(meusGatos);
    // 2 forma
    meusGatos.sort(new ComparatorCor());
    System.out.println(meusGatos);


    System.out.println("\n");


    System.out.println("6 - Mostrar por ordem Nome/Cor/Idade");
    // 1 forma
    Collections.sort(meusGatos, new ComparatorNomeCorIdade());
    System.out.println(meusGatos);
    // 2 forma
    meusGatos.sort(new ComparatorNomeCorIdade());
    System.out.println(meusGatos);
  }
}


class Gato implements Comparable<Gato>{
  // Atributos
  private String nome;
  private Integer idade;
  private String cor;

  // Construtor
  public Gato(String nome, Integer idade, String cor) {
    this.nome = nome;
    this.idade = idade;
    this.cor = cor;
  }

  // Gerando os get´s para eu poder buscar os dados (pois os atributos são privados)
  public String getNome() {
      return nome;
  }
  public Integer getIdade() {
      return idade;
  }
  public String getCor() {
      return cor;
  }

  // Sobrescrevendo o método get para poder buscar os valores e não os endereços de memória
  @Override
  public String toString() {
    return "{" +
            "nome='" + nome + '\'' +
            ", idade=" + idade +
            ", cor='" + cor + '\'' +
            '}';
  }

  @Override
  // para deixar na ordem natural pelo nome do gato
  public int compareTo(Gato gato) {
    return this.getNome().compareToIgnoreCase(gato.getNome());
  }
}


class ComparatorIdade implements Comparator<Gato> {
  @Override
  public int compare(Gato g1, Gato g2) {
    return Integer.compare(g1.getIdade(), g2.getIdade());
  }
}

class ComparatorCor implements Comparator<Gato> {
  @Override
  public int compare(Gato g1, Gato g2) {
      return g1.getCor().compareToIgnoreCase(g2.getCor());
  }
}


class ComparatorNomeCorIdade implements Comparator<Gato> {
  @Override
  public int compare(Gato g1, Gato g2) {
    int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
    if (nome != 0) return nome;

    int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
    if(cor !=0) return cor;

    return Integer.compare(g1.getIdade(), g2.getIdade());
  }
}
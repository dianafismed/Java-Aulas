package Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
  Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
  Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
  a) Ordem de inserção;
  b) Ordem natural(nome);
  c) IDE;
  d) Ano de criação e nome;
  e) Nome, ano de criação e IDE;
  Ao final, exiba as linguagens no console, um abaixo da outra.
*/


public class ex2_linguagem {
  public static void main(String[] args) {
    // Criando o conjunto
    Set<LinguagemFavorita> list = new HashSet<>();
    list.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
    list.add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
    list.add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));
    System.out.println(list + "\n\n");

    
    System.out.println("a) Ordem de inserção");
    Set<LinguagemFavorita> insercao = new LinkedHashSet<>();
    insercao.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
    insercao.add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
    insercao.add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));
    for(LinguagemFavorita ordem: insercao) System.out.println(ordem);
    System.out.println("\n\n");


    System.out.println("Ordem natural(nome)");
    Set<LinguagemFavorita> natural = new TreeSet<>(insercao);
    for(LinguagemFavorita ordem: natural) System.out.println(ordem);
    System.out.println("\n\n");


    System.out.println("Por IDE");
    Set<LinguagemFavorita> ide = new TreeSet<LinguagemFavorita>(new ComparatorIde());
    ide.addAll(insercao);
    for(LinguagemFavorita ordem: ide) System.out.println(ordem);
    System.out.println("\n\n");


    System.out.println("Por ano de criação e nome");
    Set<LinguagemFavorita> anonome = new TreeSet<LinguagemFavorita>(new ComparatorAnoNome());
    anonome.addAll(insercao);
    for(LinguagemFavorita ordem: anonome) System.out.println(ordem);
    System.out.println("\n\n");


    System.out.println("Por Nome, ano de criação e IDE");
    Set<LinguagemFavorita> nomeAnoIde = new TreeSet<LinguagemFavorita>(new ComparatorAnoNomeIde());
    nomeAnoIde.addAll(insercao);
    for(LinguagemFavorita ordem: nomeAnoIde) System.out.println(ordem);
    System.out.println("\n\n");
  }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
  public String nome;
  public Integer anoCriacao;
  public String ide;

  public LinguagemFavorita(String nome, Integer anoCriacao, String ide) {
    this.nome = nome;
    this.anoCriacao = anoCriacao;
    this.ide = ide;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getAnoCriacao() {
    return anoCriacao;
  }

  public void setAnoCriacao(Integer anoCriacao) {
    this.anoCriacao = anoCriacao;
  }

  public String getIde() {
    return ide;
  }

  public void setIde(String ide) {
    this.ide = ide;
  }

  @Override
  public String toString() {
    //return "[nome=" + nome + ", anoCriacao=" + anoCriacao + ", ide=" + ide + "]";
    return(nome + "\t" + anoCriacao + "\t" + ide);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LinguagemFavorita that = (LinguagemFavorita) o;
    return nome.equals(that.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome);
  }

  // Faz a comparação entre os nomes e coloca em ordem alfabética
  @Override
  public int compareTo(LinguagemFavorita linguagemFavorita) {
    return this.nome.compareTo(linguagemFavorita.nome);
  }
}

class ComparatorIde implements Comparator<LinguagemFavorita>{
  @Override
  public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
    return o1.ide.compareToIgnoreCase(o2.ide);
  }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{
  @Override
  public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
    int anoCriacao = Integer.compare(o1.anoCriacao, o2.anoCriacao);
    if(anoCriacao !=0 ) return anoCriacao;
    return o1.nome.compareToIgnoreCase(o2.nome);
  }
}

class ComparatorAnoNomeIde implements Comparator<LinguagemFavorita>{
  @Override
  public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
    int nome = o1.nome.compareToIgnoreCase(o2.nome);
    int anoCriacao = Integer.compare(o1.anoCriacao, o2.anoCriacao);
    if(nome!= 0) return nome;
    if(anoCriacao !=0 ) return anoCriacao;
    return o1.ide.compareToIgnoreCase(o2.ide);
  }
}



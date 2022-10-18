package Desafio;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

/*
  Neste problema, deve-se ler:
  O código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1.
  O código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
  Após, calcule e mostre o valor a ser pago.
*/

public class desafio2 {
  public static void main(String[] args) {
    try (Scanner leitor = new Scanner(System.in)) {
      List<Produto> produtos = new ArrayList<>();
      Double total = 0d;
      
      for(int i=0; i<2; i++){
        int cod = leitor.nextInt();
        int n = leitor.nextInt();
        double valor = leitor.nextDouble();
        produtos.add(new Produto(cod, n, valor));
        total +=(n*valor);
      }
      //System.out.println(produtos);
      System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    } 
  }
}

class Produto{
  private Integer codigo;
  private Integer quantidade;
  private Double valor;

  public Produto(Integer codigo, Integer quantidade, Double valor) {
    this.codigo = codigo;
    this.quantidade = quantidade;
    this.valor = valor;
  }

  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public Integer getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  @Override
  public String toString() {
    return "Produto [codigo=" + codigo + ", quantidade=" + quantidade + ", valor=" + valor + "]";
  }
}
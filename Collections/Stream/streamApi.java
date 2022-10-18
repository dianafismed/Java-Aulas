package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class streamApi {
  public static void main(String[] args) {
    List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

    System.out.println("Imprima todos os elementos dessa lista de String: ");
    // Uma forma
    numerosAleatorios.stream().forEach(new Consumer<String>() {
      @Override
      public void accept(String t) {
        System.out.println(t); 
      }  
    });
    // Uma forma lambda
    numerosAleatorios.stream().forEach(t -> System.out.println(t));
    // Outra forma lambda
    numerosAleatorios.stream().forEach(System.out::println);
    // Outra forma lambda
    numerosAleatorios.forEach(System.out::println);
    // Outra forma lambda
    numerosAleatorios.forEach(t -> System.out.println(t));
    

    System.out.println("\n\n");


    System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
                                                // coleta o valor e joga num set
    numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
    // Lembrar que Set não aceita números repetidos
    // Posso atribuir o resultado à uma variável
    Set<String> numerosAleatorios5Primeiros = numerosAleatorios.stream()
      .limit(5)
      .collect(Collectors.toSet());
      System.out.println(numerosAleatorios5Primeiros);


    System.out.println("\n\n");


    System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
    // o método map faz o casting de string para integer
    numerosAleatorios.stream().map(new Function<String,Integer>() {
      @Override
      public Integer apply(String t) {
        return Integer.parseInt(t);
      }
    });
    // Reduzindo para lambda
    numerosAleatorios.stream()
      .map(Integer::parseInt)
      .collect(Collectors.toList())
      .forEach(System.out::println);
    // Colocando dentro de uma variável
    //List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
    //  .map(Integer::parseInt)
    //  .collect(Collectors.toList());
    
    List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
      .map(Integer::parseInt)
      .collect(Collectors.toList());


    System.out.println("\n\n");


    System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
    List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
      .map(Integer::parseInt)
      .filter(i -> (i % 2 == 0 && i > 2))
      .collect(Collectors.toList());
    System.out.println(listParesMaioresQue2);


    System.out.println("\n\n");

    
    System.out.println("Mostre a média dos números: ");
    // Uma forma
    numerosAleatorios.stream()
      .mapToInt(new ToIntFunction<String>() {
        @Override
        public int applyAsInt(String value) {
          return Integer.parseInt(value);
        }
      });
    // Simplificada
    numerosAleatorios.stream()
      .mapToInt(value -> Integer.parseInt(value));

    // Buscando a média com o average
    numerosAleatorios.stream()
      .mapToInt(value -> Integer.parseInt(value))
      .average()
      .ifPresent(new DoubleConsumer() {
        @Override
        public void accept(double value) {
          System.out.println(value);          
        }
      });
    //Simplificando
    numerosAleatorios.stream()
      .mapToInt(value -> Integer.parseInt(value))
      .average()
      .ifPresent(value->System.out.println(value));          
    // Simplificando mais
    numerosAleatorios.stream()
      .mapToInt(Integer::parseInt)
      .average()
      .ifPresent(System.out::println);
    

    System.out.println("\n\n");


    System.out.println("Remova os valores ímpares: ");
    // Não uso o stream agora, pq o stream nao altera minha lista original

    numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
      @Override
      public boolean test(Integer t) {
        if(t%2 != 0) return true;
        return false;
      }
    });
    System.out.println(numerosAleatoriosInteger);

    // Simplificando
    numerosAleatoriosInteger.removeIf(i -> (i %2 != 0));
    System.out.println(numerosAleatoriosInteger);


    System.out.println("\n\n");



    List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't'); 
    System.out.println(consoantesMeuNome);

    Set<String> coresDaBandeiraDoBrasil = new TreeSet<>(Arrays.asList("verde", "amarelo", "azul", "branco"));
    System.out.println(coresDaBandeiraDoBrasil);


//        Para você
//         System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
//         numerosAleatoriosInteger.stream()
//                 .skip(3)
//                 .forEach(System.out::println);

//         long countNumerosUnicos = numerosAleatoriosInteger.stream()
//                 .distinct()
//                 .count();
//         System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

//         System.out.print("Mostre o menor valor da lista: ");
//         numerosAleatoriosInteger.stream()
//                 .mapToInt(Integer::intValue)
//                 .min()
//                 .ifPresent(System.out::println);

//         System.out.print("Mostre o maior valor da lista: ");
//         numerosAleatoriosInteger.stream()
//                 .mapToInt(Integer::intValue)
//                 .max()
//                 .ifPresent(System.out::println);;

//         int somaDosNumerosPares = numerosAleatoriosInteger.stream()
//                 .filter(i -> (i % 2 == 0))
//                 .mapToInt(Integer::intValue)
//                 .sum();
//         System.out.println("Pegue apenas os números pares e some: " + somaDosNumerosPares);

//         System.out.println("Mostre a lista na ordem númerica: ");
//         List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
//                 .sorted(Comparator.naturalOrder())
//                 .collect(Collectors.toList());
//         System.out.println(numerosOrdemNatural);

//         System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
// //        dica: collect(Collectors.groupingBy(new Function())
//         Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream()
//                 .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
//         System.out.println(collectNumerosMultiplosDe3E5);
  }
}

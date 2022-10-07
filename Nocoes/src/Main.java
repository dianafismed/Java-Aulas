/* Java é fortemente tipada
   escreve sout que a IDE ja preenche o System.out.println()

- Variáveis e tipos de variáveis
- Operadores lógicos: and(&&), or(||), igual (==), diferente ()
- Operador ternario (?)
- Operadores condicionais: if/else, switch
- Strings: .toUpperCase(), .toLowerCase(), .length()
- Data
- Laços de repetição: for
- Arrays: não pode misturar tipos no array
- Funções
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // char
        String nome = "Diana";
        String rua;
        rua = "Orlando Bartocci";
        System.out.println("Hello, " + nome + " que mora na rua " + rua);

        // int
        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        System.out.println(soma);

        // float
        float c = 3;
        float d = 2;
        float divisao = c/d;
        System.out.println(divisao);

        // boolean
        boolean resultado = false;
        System.out.println(resultado);

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);

        // operador ternário
        String mensagem = fimDeSemana ? "É fds" : "Não é";
        System.out.println(mensagem);

        // if - else
        int grade = 7;

        if (grade >= 7){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }

        // switch
        int nota = 5;
        String graduacao;

        if (nota >= 8){
            graduacao = "A";
        }else if (nota < 8 && nota >= 7){
            graduacao = "B";
        }else if (nota < 7 && nota >= 6){
            graduacao = "C";
        }else if (nota < 6 && nota >= 0){
            graduacao = "D";
        }else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Não aprovado");
                break;
            default:
                System.out.println("Valor inválido");
        }


        String name = "Diana";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());

        String nomeOutro = "Diana";
        System.out.println(name.equals(nomeOutro)); // verifica se name é igual a nomeOutro
        System.out.println(name.equalsIgnoreCase(nomeOutro)); // Ignora maiúsculas e minúsculas

        // Data
        // Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA.
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek());

        Locale brasil = new Locale("pt", "BR");
        LocalDateTime agora = LocalDateTime.now();
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;

        if(agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "Bom dia";
        }else if (agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "Boa tarde";
        }else {
            saudacao = "Boa noite";
        }
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", name, diaSemana, saudacao);


        // Laços de repetição
        // for
        for(int i = 1; i <= 10; i++){
            for (int j = 1; i <= 10; i++)
                System.out.println(j + "x" + i + " = " + j * i);
        }

        // Arrays - tenho que definir o tamanho na declaração
        int[] numeros = new int[5];
        for (int i=0; i<5; i++){
            numeros[i] = i;
        }
        for (int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);;
        }

        String[] letras = {"A","B"};
        System.out.println(Arrays.toString((letras)));

        // funções
        String user = "Diana";
        saudacao(user);

        int total = soma(2, 3);
        System.out.println(total);


    }
    public static void saudacao(String user){
        System.out.println("Ola, " + user);
    }

    public static int soma(int a, int b){
        return a + b;
    }


}


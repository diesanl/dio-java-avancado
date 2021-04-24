package br.com.digital.innovation.one.aula2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {

    public static void main(String[] args) {
        String[] nomes = {"Diego", "Diego", "Joao", "Willian", "Maria", "Patrícia", "Júlia", "Mariana"};
        Integer[] numeros = {1, 2, 3, 4, 5};
//        imprimirNomesFiltrados(nomes);
//        imprimirTodosNomes(nomes);
//        imprimirODobroDeCadaItemDaLista(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de projeto");
        profissoes.add("Gerente de qualidade");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("r", 2))
                .forEach(System.out::println);

    }


    public static void imprimirNomesFiltrados(String... nomes) {

        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("Diego")) {
                nomesParaImprimir += "" + nomes[i];
            }
        }

        System.out.println("Nomes do for: " + nomesParaImprimir);


        String nomesparaImprimirDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Diego"))
                .collect(Collectors.joining());// add tudo numa string

        System.out.println("Nomes do stream: " + nomesparaImprimirDaStream);


//        String nomesResultados = Stream.of(nomes).filter(nome -> nome.equals("Diego"))
//                .collect(Collectors.joining());
//        System.out.println(nomesResultados);
    }


    public static void imprimirTodosNomes(String... nomes) {
        for (String nome : nomes) {
            System.out.println("Imprimido pelo for: " + nome);
        }

        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimido pelo forEach: " + nome));
    }

    /**
     * @param numeros, onde os (...) significam um array, poderia ser substituído por []
     */
    public static void imprimirODobroDeCadaItemDaLista(Integer... numeros) {
        for (Integer numero : numeros) {
            System.out.println("For: " + numero * 2);
        }
        Stream.of(numeros).map(numero -> numero * 2)
                .forEach(x -> System.out.println("forEach: " + x));
    }
}

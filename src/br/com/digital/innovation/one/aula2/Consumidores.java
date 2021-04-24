package br.com.digital.innovation.one.aula2;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        //Method Reference

//        - apenas
//        - utilizar o parametro da forma que ele foi recebido;

        //forma por método de referência, onde
        // escondemos o parâmetro e passamos apenas a ação a ser executada:
        Consumer<String> imprimirUmaFrase = System.out::println;
        //forma "comum"parâmetro -> ação a ser executada
        Consumer<String> imprimirUmaFrase2 = frase -> System.out.println(frase);

        //o accept vem do consumer p q possamos executar o comportamento definido no lambda
        imprimirUmaFrase.accept("Hello World");
        imprimirUmaFrase2.accept("Holly s**t");

        //EX:
        Consumer<Integer> imprimeNumero = System.out::println;
        imprimeNumero.accept(1985);

    }
}

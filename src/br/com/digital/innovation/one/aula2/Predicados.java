package br.com.digital.innovation.one.aula2;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        //this method reference
//        Predicate<String> estaVazio = String::isEmpty;
        //or this
        Predicate<String> estaVazio = text -> text.isEmpty();
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Diego"));
    }
}

package br.com.digital.innovation.one.aula2;

import java.util.function.Supplier;

public class Suplidores {
    public static void main(String[] args) {
        //this
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        //or this method reference
        Supplier<Pessoa> instanciaPessoa2 = Pessoa::new;
        System.out.println(instanciaPessoa.get());
        System.out.println(instanciaPessoa2.get());
    }
}


class Pessoa {
    private String nome;
    private Integer idade;
    private String otherProperty;

    public Pessoa() {
        nome = "Diego";
        idade = 36;
        otherProperty = "YAAAYYYYYYY";
    }

    @Override
    public String toString() {
        return String.format("nome : %s, idade: %d, Whatever: %s", nome, idade, otherProperty);
    }
}

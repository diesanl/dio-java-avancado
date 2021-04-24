package br.com.digital.innovation.one.aula1;

public class Aula {
    public static void main(String[] args) {
        Funcao1 funcao1 = valor -> {
//            System.out.println(valor);
            return valor;
        } ;

        System.out.println(funcao1.gerar("Zidane"));
    }
}



interface Funcao1 {
    String gerar(String valor);
}

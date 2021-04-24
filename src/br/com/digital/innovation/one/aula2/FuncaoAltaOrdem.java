package br.com.digital.innovation.one.aula2;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
      Calculo PLUS =  ( a, b) -> a+b;
      Calculo MINUS =  ( a, b) -> a-b;
      Calculo TIMES =  ( a, b) -> a*b;
      Calculo DIVIDED =  ( a, b) -> a/b;
        System.out.println(executarOperacao(PLUS,2,3));//5
        System.out.println(executarOperacao(MINUS,10,3));//7
        System.out.println(executarOperacao(TIMES,8,3));//24
        System.out.println(executarOperacao(DIVIDED,100,3));//33
    }



    public static int executarOperacao(Calculo calculo,int a, int b){
        return calculo.calcular(a,b);
    }
}


@FunctionalInterface
interface Calculo {
    public int calcular(int a, int b);
}
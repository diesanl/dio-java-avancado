package br.com.digital.innovation.one.desafios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ValidadorSenha {
    private static final Integer MIN_VALUE = 6;
    private static final Integer MAX_VALUE = 32;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //get input
        String pwd = br.readLine();

        //Boolean for pwd
//        Boolean pwdOk = Boolean.FALSE;


        //create + filling alphabetListLowerCase
        List<Character> alphabetListLC = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetListLC.add(c);
        }

        //create + filling alphabetListUpperCase
        List<Character> alphabetListUC = new ArrayList<>();
        alphabetListLC.stream().forEach(i -> alphabetListUC.add(Character.toUpperCase(i)));

        //test
//        alphabetListLC.stream().forEach(System.out::println);
//        alphabetListUC.stream().forEach(System.out::println);

        //check size
        Boolean sizeOk = checkSize(pwd);

        //check Lower char on String
        Boolean lowerCharOk = checkLowerCharOnString(pwd, alphabetListLC);

        //check Upper char on String
        Boolean upperCharOk = checkUpperCharOnString(pwd, alphabetListUC);

        //check if there's at least 1 number
        Boolean numberOk = checkIfTheresNumber(pwd);

        String answer = (sizeOk && lowerCharOk && upperCharOk && numberOk) ? "Senha valida." : "Senha invalida.";

//        System.out.println(pwd);
//        System.out.println(pwdOk);
        System.out.println(answer);
    }

    private static Boolean checkIfTheresNumber(String pwd) {
        for (Character c: pwd.toCharArray()) {
            if (Character.isDigit(c)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private static Boolean checkLowerCharOnString(String pwd, List<Character> alphabetListLC) {
        for (Character letter : alphabetListLC) {
            if (pwd.contains(letter.toString())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private static Boolean checkUpperCharOnString(String pwd, List<Character> alphabetListUC) {
        for (Character letter : alphabetListUC) {
            if (pwd.contains(letter.toString())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private static Boolean checkSize(String pwd) {
        if (pwd.length() >= MIN_VALUE && pwd.length() <= MAX_VALUE) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
}

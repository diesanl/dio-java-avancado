package br.com.digital.innovation.one.desafios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrevista {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //get input
        String nextWord; //= br.readLine();

        while ((nextWord = br.readLine()) != null) {
            Boolean foundIt = Boolean.FALSE;

            for (int i = 0; i < nextWord.length(); i++) {
                if (nextWord.substring(0, i).endsWith(nextWord.substring(i))) {
                    System.out.println(nextWord.substring(0, i));
                    foundIt = Boolean.TRUE;
                }
            }
            if (!foundIt) {
                System.out.println(nextWord);
            }
        }

    }
}

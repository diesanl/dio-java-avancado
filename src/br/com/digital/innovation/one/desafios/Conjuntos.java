package br.com.digital.innovation.one.desafios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Conjuntos {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer numberOfInputs = Integer.valueOf(br.readLine());

        while (numberOfInputs != 0) {
            List<String> groupList = new ArrayList<>();
            for (int i = 0; i < numberOfInputs; i++) {
                groupList.add(br.readLine());
            }
            groupList = groupList.stream().sorted().collect(Collectors.toList());

            String exit = "Conjunto Bom";

            for (int i = 0; i < numberOfInputs - 1; i++) {
                if (groupList.get(i + 1).startsWith(groupList.get(i))) {
                    exit = "Conjunto Ruim";
                    break;
                }
            }
            System.out.println(exit);
            numberOfInputs = Integer.valueOf(br.readLine());
        }
    }
}

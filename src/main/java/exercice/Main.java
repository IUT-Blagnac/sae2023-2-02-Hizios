package exercice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        String texte = "exemple de texte a classer";
        List<Character> ordre = List.of('c', 't', 'e', 'x', 'a', 'm', 'p', 'l', 's', 'r', 'd');

        long startTime = System.nanoTime();
        System.out.println(Exercice.solution(texte,ordre));
        long endTime = System.nanoTime();
        long durationInNanos = endTime - startTime;
        double durationInMilliseconds = (double) durationInNanos / 1_000_000;

        System.out.println("Durée en millisecondes : " + durationInMilliseconds);
       
        // output: [classer, texte, exemple, a, de]
    }
}

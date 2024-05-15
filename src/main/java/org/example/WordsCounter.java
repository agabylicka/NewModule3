package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordsCounter {
    public HashMap<String, Integer> countWords(String text) {
        //inicjalizacja hashmap - słowo, ilość
        HashMap<String, Integer> counts = new HashMap<>();
        // przetworzenie mapy
        //usunięcie kropek i przecinków, zrób małe litery, podziel na słowa po spacji
        String[] fixedText = text.toLowerCase().replaceAll("\\.", "")
                .replaceAll("\\,", "").split(" ");
        for (String word : fixedText) {
            //System.out.println(word);
            if (counts.containsKey(word)) {
                // podbicie liczebności słowa
                Integer entry = counts.get(word) + 1;
                counts.put(word, entry);
            } else {
                // dodanie nowego słowa
                counts.put(word, 1);
            }
        }
        //zwrot mapy
        return counts;
    }
}

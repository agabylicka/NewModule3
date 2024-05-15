package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        Array array1 = new Array();
        int sum = array1.sumArray(array);
        System.out.println(sum); */

        /*TodoLIst todoLIst = new TodoLIst();
        todoLIst.add("task1");
        todoLIst.add("task2");
        todoLIst.print();
        todoLIst.remove(0); */

        WordsCounter wordsCounter = new WordsCounter();
        HashMap<String, Integer> counter = wordsCounter.countWords(Lipsum.text);
        for (String key : counter.keySet()) {
            System.out.println(key + " " + counter.get(key));
        }


    }

}
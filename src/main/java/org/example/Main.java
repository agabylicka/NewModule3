package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        Array array1 = new Array();
        int sum = array1.sumArray(array);
        System.out.println(sum);

        TodoLIst todoLIst = new TodoLIst();
        todoLIst.add("task1");
        todoLIst.add("task2");
        todoLIst.print();
        todoLIst.remove(0);

        WordsCounter wordsCounter = new WordsCounter();
        HashMap<String, Integer> counter = wordsCounter.countWords(Lipsum.text);
        for (String key : counter.keySet()) {
            System.out.println(key + " " + counter.get(key));
        }
        Student one = new Student(23, 154,"Ba", "C");
        Student two = new Student(21, 146,"Aa", "C");
        Student three = new Student(25, 154,"Ba", "A");
        Student four = new Student(22, 156,"Ca", "B");
        Student five = new Student(23, 154,"Aa", "B");

        ArrayList<Student>sorts = new ArrayList<>();
        sorts.add(one);
        sorts.add(two);
        sorts.add(three);
        sorts.add(four);
        sorts.add(five);
        Collections.sort(sorts);
        for (int i = 0; i <sorts.size(); i++) {
            System.out.println(sorts.get(i).getLastName() + " " + sorts.get(i).getName());
        }
    }
}
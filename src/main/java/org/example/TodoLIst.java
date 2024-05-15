package org.example;

import java.util.ArrayList;

public class TodoLIst {
    private ArrayList<String> todo;
    public TodoLIst() {
        if (todo == null) {
            todo = new ArrayList<>();
        }
    }

    public void add(String task){
        todo.add(task);
    }
    public void print() {
        for ( int i = 0; i < todo.size(); i++ ) {
            System.out.println(todo.get(i));
        }

    }
    public void remove(int number) {
        for ( int i = 0; i < todo.size(); i++ ) {
            todo.remove(number);
        }

    }

}

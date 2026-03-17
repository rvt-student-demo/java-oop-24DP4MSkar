package rvt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private ArrayList<String> todos;
    private final String filePath = "data/todo.csv";

    public ToDoList() {
        this.todos = new ArrayList<>();

        try (Scanner reader = new Scanner(new File(filePath))) {
            if (reader.hasNextLine()) {
                reader.nextLine(); 
            }

            while (reader.hasNextLine()) {
                todos.add(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void add(String task) {
        this.todos.add(task);
    }

    public void remove(int number) {
        this.todos.remove(number - 1);
    }

    public void print() {
        for (int i = 0; i < todos.size(); i++) {
            System.out.println((i + 1) + ": " + todos.get(i));
        }
    }
}

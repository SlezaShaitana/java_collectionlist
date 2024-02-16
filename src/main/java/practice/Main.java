package practice;

import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();
    private static int index = 0;
    private static String todo = "";

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList
        while (true) {
            String input = new Scanner(System.in).nextLine();
            String[] inputCommand = input.split("", 3);
            switch (inputCommand[0]) {
                case "ADD":
                    if (inputCommand[1].matches("[0-9]+")) {
                        index = Integer.parseInt(inputCommand[1]);
                        todo = (inputCommand[2]);
                        todoList.add(index, todo);

                    } else {
                        todo = inputCommand[1] + " " + inputCommand[2];
                        todoList.add(todo);
                    }
                    break;
                case "EDIT":
                    if (inputCommand[1].matches("[0-9]+")) {
                        index = Integer.parseInt(inputCommand[1]);
                        todo = inputCommand[2];
                        todoList.edit(index, todo);
                    }
                    break;

                case "DELETE":
                    if (inputCommand[1].matches("[0-9] + ")) {
                        index = Integer.parseInt(inputCommand[1]);
                        todoList.delete(index);
                    }
                    break;
                case "LIST":
                    todoList.getTodos();
                    for (int i = 0; i < todoList.list.size(); i++) {
                        System.out.println(i + "-" + todoList.list.get(i));
                    }
                    break;
            }
        }
    }
}


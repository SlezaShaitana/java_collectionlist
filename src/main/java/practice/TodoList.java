package practice;

import java.util.ArrayList;

public class TodoList {
    public ArrayList<String> list = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        list.add(todo);
        System.out.println("Добавлено дело " + '"' + todo + '"');

    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (index >= 0 && index <= list.size()) {
            list.add(index, todo);
            System.out.println("Добавлено дело" + '"' + todo + '"' + " на указанный номер " + index);
        } else {
            list.add(todo);
            System.out.println("Дело с таким номером не существует");
        }
    }

    public void edit(int index, String todo) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (index <= list.size() -1) {
            System.out.println("Дело" + '"' + list.get(index) + '"' + "заменено на " + '"' + todo + '"');
            list.set(index, todo);
        } else {
            System.out.println("Дело с таким номером не существует");
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (index <= list.size() -1){
            System.out.println("Дело" + '"' + list.get(index) + " удалено ");
            list.remove(index);
        } else {
            System.out.println("Дело с таким номером не сущесивует");
        }
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return list;
    }

}
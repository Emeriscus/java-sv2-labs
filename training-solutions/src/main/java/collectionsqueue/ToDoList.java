package collectionsqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ToDoList {

    private List<ToDo> toDos = new ArrayList<>();

    public ToDoList(List<ToDo> toDos) {
        this.toDos = toDos;
    }

    public List<ToDo> getToDos() {
        return toDos;
    }

    public Deque<ToDo> getTodosInUrgencyOrder() {

        Deque<ToDo> result = new ArrayDeque<>();

        for (ToDo actual : toDos) {
            if (actual.isUrgen()) {
                result.addFirst(actual);
            } else {
                result.addLast(actual);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<ToDo> toDos = new ArrayList<>();
        toDos.add(new ToDo("ddd", false));
        toDos.add(new ToDo("bbb", true));
        toDos.add(new ToDo("aaa", false));
        toDos.add(new ToDo("fff", true));
        toDos.add(new ToDo("ccc", false));
        toDos.add(new ToDo("zzz", false));
        toDos.add(new ToDo("kkk", true));

        ToDoList toDoList = new ToDoList(toDos);

        Deque<ToDo> result = new ArrayDeque<>();
        result = toDoList.getTodosInUrgencyOrder();
        System.out.println(result);
        System.out.println();

        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
    }
}

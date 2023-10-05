import java.util.ArrayList;
import java.util.List;

public class ToDo {

    private List<String> todos;
    String listing;

    public ToDo() {
        todos = new ArrayList<>();
    }

    public List<String> getTodos() {
        return this.todos;
    }

    public void addTodo(String todo) {
        this.todos.add(todo);
    }

    public String removeTodo(int index) {
        return this.todos.remove(index-1);
    }

    public void printTodo() {

        if (this.todos.isEmpty()){
            System.out.println("No todos for today! :)");}
        else {
        for (int i = 0; i < this.todos.size(); i++) {
            System.out.println((i + 1) + ". " + this.todos.get(i));
        }
        }
    }

}

public class Main {

    public static void main(String[] args) {

        for(int i = 0; i< args.length; i++) {
            System.out.println(String.format(args[i]));
        }


        System.out.println("---------------------");

        ToDo toDo = new ToDo();
        toDo.addTodo("Walk the dog");
        toDo.addTodo("Buy milk");
        toDo.addTodo("Do homework");

        toDo.printTodo();


        System.out.println("------------------");


        String firstCommand = args[0];
        String secondCommand = args[1];

        if (firstCommand.equals("-a")) {
            toDo.addTodo(secondCommand);
        } else if (secondCommand.equals(null)) {
            System.out.println("Unable to add: no task provided");

        }
        toDo.printTodo();

        System.out.println("------------------");


        if (firstCommand.equals("-r")) {
            toDo.removeTodo(Integer.parseInt(secondCommand));
        } if (secondCommand.isEmpty()) {
            System.out.println("Unable to remove: no index provided");
        } if (secondCommand.equals(20)){
            System.out.println("Unable to remove: index is out of bound");
        } else if (secondCommand.equals("apple")){
            System.out.println("Unable to remove: index is not a number");
        }


        toDo.printTodo();
    }
}

import java.util.Date;

public class TestsExamples {
    public static void main(String[] args) {
        //TestInstanzen ToDoTree and inheriting Classes:
        try {
            ToDoTree Tree1 = new ToDoTree("ToDoTreeTest", false);
            System.out.println("ToDoTree created");
            ToDo ToDo1 = new ToDo("ToDoTreeTest", "testtodo",
                    new Date(2000, 11, 21), "high", true, false);
            System.out.println("ToDo created");
            TeilToDo TeilToDo1 = new TeilToDo("ToDoTreeTest", "testtodo",
                    new Date(2000, 11, 21), "high", true, false);
            System.out.println("TeilToDo created");
        }
        catch (Exception e) {
            System.err.println("catched Exception e" + e);
        }
        //ToDoTreeMethods Tests:
        //ToDoMethods Tests:
        //TeilToDoMethods Tests:
        //DynamicLengthArray Tests:

    }
}

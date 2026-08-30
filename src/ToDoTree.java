
public class ToDoTree {
    protected String _theme;
    protected ToDo[] _toDoTree; //list of ToDos that inherit from specific ToDoTreeInstance (dynamisches ArrayObjekt implementieren!!)
    protected boolean _completed;
    //Constructor:
    ToDoTree(String theme, boolean completed) {
        _theme = theme;
        _toDoTree = null;
        _completed = completed;
    }
    //Methods:
    public String getTheme() {return _theme;}
    public ToDo[] getToDos() {return _toDoTree;}
    public boolean getIsCompleted() {return _completed;}
    public void setIsCompleted(boolean completed) {
        _completed = true;}
    public void changeTheme(String theme) {
        _theme = theme;}
    //adds new ToDo-Object to the Dynamic-length-Array that contains the inheriting ToDos belonging to this ToDoTree
    public void addNewToDo(ToDo newToDo) {
        //changes length n of _toDoTree to n+1
        //set newToDo to Index n+1 of _toDoTree
    }
    public void deleteToDo(ToDo delete) {
        //searches _toDoTree-dynamic-Array for the given ToDo-Instance
        //sets Indexof(delete) = null
        //changes length n of _toDTree to n-1
    }
    /*werden geänderte Eigenschaften automatisch weitervererbt an ihre bereits erzeugten Kinder? Ne oder?
    Muss ich dann halt Vererbungsmethoden jew. implementieren
     */
}

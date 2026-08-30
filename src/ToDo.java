import java.util.Date;

public class ToDo extends ToDoTree{
    protected String _name;
    protected Date _deadline;
    protected String _priority;
    protected boolean _unlocked;
    protected boolean _completed;
    protected TeilToDo[] _teilToDos; //contains eventual PartToDos (Dynamic length Array implementieren!!)
    //Constructor:
    ToDo(String theme, String name, Date deadline, String priority, boolean unlocked, boolean completed) {
        super(theme, completed); //ruft ToDoTree-Constructor auf
        _name = name;
        _deadline = deadline;
        _priority = priority;
        _unlocked = unlocked;
        _completed = completed;
    }
    //Methods:
    public String getName() {return _name;}
    public Date getDeadline() {return _deadline;}
    public String getPriority() {return _priority;}
    public boolean isUnlocked() {return _unlocked;}
    public boolean isCompleted() {return _completed;}
    public TeilToDo[] getTeilToDos() {return _teilToDos;}
    public void changName(String newName) {
        _name = newName;}
    public void changDeadline(Date newDeadline) {
        _deadline = newDeadline;}
    public void changPriority(String newPriority) {
        _priority = newPriority;}
    public void changUnlocked(boolean newUnlocked) {
        _unlocked = newUnlocked;}
    public void changCompleted(boolean newCompleted) {
        _completed = newCompleted;}
    public void addTeilToDo(TeilToDo teilToDo) {}
    public void deleteTeilToDo(TeilToDo teilToDo) {}
}

import java.util.Date;
public class TeilToDo extends ToDo {
    protected String _teiltodo_name;
    protected Date _partdeadline;
    protected String _priority;
    protected boolean _unlocked;
    protected boolean _completed;
    protected TeilToDo[] _teilteilToDos; //list(dynamic array) of eventual partToDos that inherit from this one
    //Constructor:
    TeilToDo(String theme,
             String name,
             Date deadline,
             String priority,
             boolean unlocked,
             boolean completed
             ) {
        super(theme, name, deadline, priority, unlocked, completed);
        _teiltodo_name = name;
        _partdeadline = deadline;
        _priority = priority;
        _unlocked = unlocked;
        _completed = completed;
        //TeilToDo[] parttodds//_teilteilToDos = new TeilToDo[0]; //dynamisches Array-Objekt implementieren
    }
    //Methods:
    public String getTeiltodo_name() {return _teiltodo_name;}
    public Date getPartdeadline() {return _partdeadline;}
    public String getPriority() {return _priority;}
    public boolean getIsUnlocked() {return _unlocked;}
    public boolean getIsCompleted() {return _completed;}
    //get TeilToDo[], returns dynamic Array with PartTodos from this one(evtl. implementieren falls nötig)
    public void changeTeiltodo_name(String newName) {
        _teiltodo_name = newName;}
    public void changePartdeadline(Date newDeadline) {
        _partdeadline = newDeadline;}
    public void changePriority(String newPriority) {
        _priority = newPriority;}
    public void changeIsUnlocked(boolean newIsUnlocked) {
        _unlocked = newIsUnlocked;}
    public void changeIsCompleted(boolean newIsCompleted) {
        _completed = newIsCompleted;}
    public void addPartToDo(TeilToDo partToDo) {
        //set length n of Array parttodos to n+1
        //set partToDo to Positon n+1 in parttodos
    }
    public void deletePartToDo(TeilToDo partToDo) {
        //set Indexof(partToDo) = null
        // seth length n of Array parttodos to n-1
    }
}

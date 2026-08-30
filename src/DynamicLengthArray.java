//Eigene Implementierung von Liste mit dynamischer Länge

public class DynamicLengthArray {
    public int _length;
    public Object[] _array;

    //Constructor:
    DynamicLengthArray(int length, Object[] _oldarray) {
        _length = length;
        if (_length == _oldarray.length) {
            _array = _oldarray;
        }
        else {
            _array = new Object[_length];
            for (int i = 0; i < _oldarray.length; i++) {
                _array[i] = _oldarray[i];
            }
        }
    }
    //Methods:
    public int getLength() {return _length;
    }
    public Object[] getArray() {return _array;
    }
    public int getIndexOf(Object value) throws Exception {
        if (_array == null) {
            throw new NullPointerException("array is null");}
        for (int i = 0; i < _length; i++) {
            if (_array[i].equals(value)) {return i;}
        }
        throw new Exception("Element Not Found");
    }
    public void replaceElementOfIndex(int index, Object newElement) {
        if (_array == null) {
            throw new NullPointerException("array is null");}
        if (index < 0 || index >= _length) {
            throw new IndexOutOfBoundsException("Index Out of Bounds");}
        else {
            _array[index] = newElement;
        }
    }
    public void replaceElementAtIndexOf(Object oldElement, Object newElement) throws Exception {
        if (_array == null) {
            throw new NullPointerException("array is null");}
        int index = getIndexOf(oldElement);
        if (index == -1) {
            throw new Exception("Element Not Found");}
        else {
            _array[index] = newElement;
        }
    }
    //public append(adds Element after the current highest Index)
    public Object[] appendElement(Object newElement) throws IllegalArgumentException {
        if (_array == null) {
            _array = new Object[_length + 1];
            _array[0] = newElement;
        }
        return  _array;
    }
    //public insertAtIndex(new_element) Adds new element to the array at a position
    public DynamicLengthArray insertAtIndex(int index, Object newElement) throws Exception {
        if (_array == null) {
            throw new NullPointerException("array is null");}
        if (index < 0 || index >= _length) {
            throw new IndexOutOfBoundsException("Index Out of Bounds");}
        DynamicLengthArray newArray = new DynamicLengthArray(_length + 1, _array);
        //shift elements above index each to new index i+1:
        newArray.replaceElementOfIndex(index-1, newElement);
        return newArray;
    }
    //public deleteAtIndex(index) Removes Element at index and returns an array with length-1
    public DynamicLengthArray removeElementAtIndex(int index) throws Exception {
        if (index < 0 || index >= _length) {
            throw new IndexOutOfBoundsException("Index Out of Bounds");}
        _array[index] = null;
        DynamicLengthArray newArray = new DynamicLengthArray(_length, _array);
        //shift all elements above index each to new index i-1:
        return newArray;
    }
}

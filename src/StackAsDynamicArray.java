import java.util.NoSuchElementException;

public class StackAsDynamicArray<T> implements Stack<T> {
    //fields
    private List<T> array;

    //constructor
    public StackAsDynamicArray(){
        array = new DynamicArray<T>();
    }

    //methods
    public boolean isEmpty(){
        return array.isEmpty();
    }

    public T pop(){
        if(isEmpty())
            throw new NoSuchElementException();
        return array.remove(array.size()-1);
    }

    public void push(T element){
        array.add(element);
    }//There is no need to check if the element is null because array.add already checks it.

    public T peek(){
        if(isEmpty())
            throw new NoSuchElementException();
        return array.get(array.size()-1);
    }
}

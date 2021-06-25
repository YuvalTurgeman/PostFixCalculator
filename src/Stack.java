public interface Stack <T> {

    //returns true iff the stack is empty.
    public boolean isEmpty();

    //inserts an element to the stack.
    public void push(T element);

    //removes and returns the last element that was inserted into the stack. (LIFO - Last In First Out).
    public T pop();

    //returns the last element that was inserted into the stack.
    public T peek();
}

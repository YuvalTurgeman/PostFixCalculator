public class IntConstantOperator implements StackOperator {

    //fields
    private Integer value;

    //constructor
    public IntConstantOperator(int v){
        value = v;
    }

    //methods
    public void apply(Stack<Integer> st){
        st.push(value);
    }

    public String toString(){
        return value.toString();
    }
}

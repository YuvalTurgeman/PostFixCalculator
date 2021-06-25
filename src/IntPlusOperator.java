public class IntPlusOperator implements StackOperator {

    //fields
    private String str = "+";

    //methods
    public void apply(Stack <Integer> st){
        Integer x = st.pop();
        Integer y = st.pop();
        st.push(x+y);
    }

    public String toString(){
        return "+";
    }
}

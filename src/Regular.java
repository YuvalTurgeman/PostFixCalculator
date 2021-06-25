public class Regular {

    public static int evaluate(Object [] postFixExpression){
        Stack<Integer> st = new StackAsDynamicArray<Integer>();
        for(Object element: postFixExpression){
            if(element instanceof Integer)
                st.push((Integer)element);
            else{
                Integer x = st.pop();
                Integer y = st.pop();
                if(element.equals("+"))
                    st.push(x+y);
                else
                    st.push(x*y);
            }
        }
        return st.pop();
    }

    public static int evaluate(StackOperator[] postFixExpression){
        Stack<Integer> st = new StackAsDynamicArray<Integer>();
        for(StackOperator element: postFixExpression)
            element.apply(st);
        return st.pop();
    }

    public static void main(String[] args) {
        Object[] postFixExpr = {5,2,3,4,"+",7,3,"+","*",11,"+","*","+",9,"*"};
        System.out.println(evaluate(postFixExpr)); //1503

        StackOperator[] postfixExpr = {
                new IntConstantOperator(5), new IntConstantOperator(2),
                new IntConstantOperator(3), new IntConstantOperator(4),
                new IntPlusOperator(),      new IntConstantOperator(7),
                new IntConstantOperator(3), new IntPlusOperator(),
                new IntMultOperator(),      new IntConstantOperator(11),
                new IntPlusOperator(),      new IntMultOperator(),
                new IntPlusOperator(),      new IntConstantOperator(9),
                new IntMultOperator()
        } ;
        for (StackOperator e : postfixExpr)
            System.out.print(e + " ");
        System.out.println("= " + evaluate(postfixExpr));

        System.out.println(evaluate(postfixExpr));
    }
}

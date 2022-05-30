package stacks;

import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.pop();
        st.size();
        st.isEmpty();
        st.peek();
    }
}

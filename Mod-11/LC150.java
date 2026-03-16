// LeetCode 150 – Evaluate Reverse Polish Notation (Medium)
import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int n=tokens.length;
        int x=0;
        for(int i=0;i<n;i++){
            if(!"+-*/".contains(tokens[i]))
                st.push(Integer.parseInt(tokens[i]));
            else{
                int pop1=st.pop();
                int pop2=st.pop();
                switch(tokens[i]){
                    case "+":x=pop1+pop2;
                        break;
                    case "-":x=pop2-pop1;
                        break;
                    case "*":x=pop1*pop2;break;
                    case "/":x=pop2/pop1;break;

                }
                st.push(x);
            }

        }
        return st.pop();
    }
}
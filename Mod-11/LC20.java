// LeetCode 20 – Valid Parentheses (Easy)
class Solution {
    public boolean isValid(String s) {
     Stack<Character> para=new Stack<>();
     for(char ch:s.toCharArray()){
        if(ch=='{'||ch=='['||ch=='(')
            para.push(ch);
        else {
            if(para.isEmpty())
                return false;
            char top=para.pop();
            if(ch==')'&&top!='(')return false;
            if(ch==']'&&top!='[')return false;
            if(ch=='}'&&top!='{')return false;
               
        }
     }
    return para.isEmpty();
    }
}
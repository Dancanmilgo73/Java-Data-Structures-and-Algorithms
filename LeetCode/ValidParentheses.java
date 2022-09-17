package LeetCode;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
    // if(s.length() == 0) return true;
    if(s.length() %2 != 0) return false;    
    Stack<Character> brackets = new Stack<>();    
    for(char c: s.toCharArray()){
        if(c == '(' || c == '{' || c == '['){
            brackets.push(c);
        }
//         if the stack is empty at this point then there are no closing brackets
        if(brackets.isEmpty()){
            return false;
        }
        if(c==')'){
            if(brackets.peek() != '('){
                return false;
            }else{
                brackets.pop();
            }
            
        }
        if(c=='}'){
            if(brackets.peek() != '{'){
                return false;
            }else{
                brackets.pop();
            }
        }
        if(c==']'){
            if(brackets.peek() != '['){
                return false;
            }else{
                brackets.pop();
            }
        }
    }   
        return brackets.isEmpty();
    }
}
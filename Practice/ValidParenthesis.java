import java.util.Stack;

class ValidParenthesis {
    public boolean isValid(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<Character>();
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]=='(') {
                stack.push(ch[i]); 
            }
            else if(ch[i]=='{'){
                stack.push(ch[i]);
            }
            else if(ch[i]=='['){
                stack.push(ch[i]);
            }
            else{
                char top = stack.peek();
                if(top == ch[i]){
                    stack.pop();
                }
            }
            System.out.println(stack);
        }
        if(stack.isEmpty()==true)
            return answer;
        else
            answer = false;
            return answer;
    }
    public static void main(){

    }
}


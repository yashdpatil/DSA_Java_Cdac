import java.util.*;
class Parenthesis{
	
		static Boolean Validp(String s){
			char[] str = new char[s.length()];
			int top =-1;
			for(char c :s.toCharArray()){
				if (c == '(' || c == '{' || c == '[' )'
					str[++top]=c;
				}else if(c == '}' && top >=0 && str[top]=='{'){
					top--;
				} else if(c==')' && top>= 0 &&str[top]=='('){
					top--;
				}else if(c == ']' && top>=0 &&str[top]=='['){
					top--;
				}
				else{
					return false;
				}
			}
			
			 return top == -1;
		}
	/*
	{{}}
	
{[}}
	
	*/
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	//boolean Check = Validp(input);
	if(Validp(input)){
		System.out.print("valid");
	}else{
		System.out.print("not  valid");
	}
	sc.close();

}
}




class Solution {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {

            if(x=='('){
                
                stack.push(')');
            } else if (x=='{') {
                stack.push('}');
                
            } else if (x=='[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop()!=x) {

                return false;
            }

        }


        return stack.isEmpty();
        
    }
}


3 rd Approch


	class Solution {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if(x == '{' || x=='(' || x == '['){
                stack.add(x);
            }else{
                if(stack.isEmpty()) return false;
                if(x =='}'&& stack.peek()!='{') return false;
                if(x ==']'&& stack.peek()!='[') return false;
                if(x ==')'&& stack.peek()!='(') return false;

                stack.pop();
            }

        }


        return stack.isEmpty();
        
    }
}


/*
Check Condition {{}} valid
	{{}} invalid
	((()))
not  valid
	*/

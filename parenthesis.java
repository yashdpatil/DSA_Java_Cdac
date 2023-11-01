import java.util.*;
class Parenthesis{
	
		static Boolean Validp(String s){
			char[] str = new char[s.length()];
			int top =-1;
			for(char c :s.toCharArray()){
				System.out.println(c);
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
/*
Check Condition {{}} valid
	{{}} invalid
	((()))
not  valid
	*/

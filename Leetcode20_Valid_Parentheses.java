import java.util.Stack;

public class Leetcode20_Valid_Parentheses {

	public static boolean isValid(String s){
		char[] ch = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(char chn : ch){
			if(stack.size()==0){
				stack.push(chn);
			}else if((chn==')'&&stack.peek()=='(')||(chn==']'&&stack.peek()=='[')||(chn=='}'&&stack.peek()=='{')){
				stack.pop();
			}else stack.push(chn);
		}
		return stack.size()==0;
	}
	public static void main(String[] Args){
		String s = "(){[]";
		boolean result = isValid(s);
		System.out.println(result);
		
	}
}


public class Leetcode557_Reverse_Words_in_a_String {
	public static void main(String[] Args){
		String s ="take";
		String test=reverseWords2(s);
		System.out.println(test);
	}
	
	public static String reverseWords(String s){
	    String[] stringSplit = s.split(" ");
	    StringBuilder builder = new StringBuilder();
	    for(int i = 0;i<stringSplit.length;i++){
	    	builder.append(new StringBuilder(stringSplit[i]).reverse().toString()+" ");
	    }
	    return builder.toString().trim();
	}
	
	public static String reverseWords2(String s){
		StringBuilder builder = new StringBuilder();
		String[] split = s.split(" ");
		for(int i = 0; i<split.length;i++){
			String str = split[i];
			char[] ch = str.toCharArray();
			int front = 0;
			int tail = ch.length-1;
			while(front<tail){
				char temp = ch[front];
				ch[front] = ch[tail];
				ch[tail] = temp;
				front++;
				tail--;
			}
			
		builder.append(new String(ch)+(i == split.length-1?"":" "));
	  }
	  return builder.toString().trim();
	}
}

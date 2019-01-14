
public class Leetcode344_Reverse_String {
	
	 public static void swap(char[] ch,int i,int j){
	        char temp = ch[i];
	        ch[i] = ch[j];
	        ch[j] = temp;
	    }

	public static String reverseString(String s){
		char[] ch = s.toCharArray();
		int i = 0;
		int j = s.length()-1;
		while(i<j){
			swap(ch,i,j);
			i++;
			j--;
		}
		return new String(ch);
	}
	
	
	public static void main(String[] Args){
		String s="hello";
		String As = reverseString(s);
		System.out.println(As);
	}
}

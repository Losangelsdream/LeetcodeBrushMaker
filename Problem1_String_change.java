
public class Problem1_String_change {
	public Problem1_String_change(){
		
	}
	
	public static void Do(char[] Str){
        int slowIndex = 0;
        int fastIndex = 0;
        while (fastIndex < Str.length) {
            if (Str[fastIndex] == ' ') {
                fastIndex++;
            } else {
                if (slowIndex != fastIndex) {
                    char temp = Str[slowIndex];
                    Str[slowIndex] = Str[fastIndex];
                    Str[fastIndex] = temp;
                    slowIndex++;
                    fastIndex++;
                    continue;
                }
                fastIndex++;
                slowIndex = fastIndex;
            }
        }
	}
	
	
	public static void main(String[] Args){
		char [] A ={'a','b','c',' ',' ','d','e','f',' ',' ',' ',' ','g','h',' ','i'};
		Do(A);
		String s = new String(A);
		System.out.println(s);
	}
}

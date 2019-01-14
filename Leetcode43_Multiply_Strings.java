
public class Leetcode43_Multiply_Strings {
	 public  static String multiply(String num1, String num2) {
		 
		 String n1 = new StringBuilder(num1).reverse().toString();
		 String n2 = new StringBuilder(num2).reverse().toString();
		 int[] d = new int[n1.length()+n2.length()];
		 for(int i = 0;i<n1.length();i++){
			 for(int j = 0;j<n2.length();j++){
				 d[i+j] += (n1.charAt(i)-'0')*(n2.charAt(j)-'0');
			 }
		 }
		 StringBuilder result = new StringBuilder();
		 for(int i = 0;i<d.length;i++){
			 int digit = d[i]%10;
			 int carry = d[i]/10;
			 if(i+1<d.length){
				 d[i+1]+=carry;
			 }
			 result.insert(0,digit);
		 }
		 while(result.charAt(0)=='0'&&result.length()>1){
			 result.deleteCharAt(0);
		 }
		 return result.toString();
	 }
		 
//	        String n1 = new StringBuilder(num1).reverse().toString();
//	        String n2 = new StringBuilder(num2).reverse().toString();
//	        //321
//	        //54
//	        
//	        //d[0+0] = 0+3*5 = 15;
//	        //d[0+1] = 0+3*4 = 12;
//	        //d[1+0] = 12+2*5 = 22;
//	        //d[1+1] = 0+8 = 8;
//	        //d[2+0] = 8+1*5 = 13;
//	        //d[2+1] = 0+1*4 = 4;
//	        
//	        //d[0] = 15 d[1] = 22 d[2] = 13 d[3] = 4; d[4] = 0;
//	   
//	        int[] d = new int[n1.length()+n2.length()];
//	        
//	        for(int i = 0;i < n1.length(); i++){
//	        	for(int j = 0; j<n2.length();j++){
//	        		d[i+j] = d[i+j]+((n1.charAt(i)-'0')*(n2.charAt(j)-'0'));
//	        		System.out.println(d[i+j]);
//	        	}
//	        }
//	        StringBuilder sb = new StringBuilder();
//	        
//	        for(int i =0;i<d.length;i++){
//	        	int digit = d[i]%10;
//	        	int carry = d[i]/10;
//	        	if(i+1<d.length){
//	        		d[i+1] = d[i+1]+carry;
//	        	}
//	        	sb.insert(0,digit);
//	        }
//	        while(sb.charAt(0)=='0' && sb.length()>1){
//				sb.deleteCharAt(0);
//			}
//	       
//			return sb.toString();    
//	         
//	    }
	 
	 public static void main(String[] Args){
		 multiply("123","45");
	
	 }
}

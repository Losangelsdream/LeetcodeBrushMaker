
public class Leetcode5_Longest_Palindromic_Substring {
	public static String longestPalindrome(String s){
		String result ="";
		int leftIndex = 0;
		int rightIndex = 0;
		int max = 0;
		
		if(s == "" && s.length()<2){
            return s;
        }

		for(int i=0;i<s.length();i++){
			int left = i-1;
			int right = i+1;
			while(left>=0&&left<right&&right<s.length()){
				if(s.charAt(left)==s.charAt(right)){
					left--;
					right++;
				}else{
					break;
				}
			}
			++left;
			--right;
			if((right-left+1)>=max){
				max = right-left+1;
				leftIndex = left;
				rightIndex = right;
			}	
		}
		for(int i=0;i<s.length();i++){//子串为偶数
            int left=i;//左边就是该字符串了
            int right=i+1;//右边第一个需要与left位置的比较
            while (left>=0&&left<right&&right<s.length()){
                if(s.charAt(left)==s.charAt(right)){
                    left--;
                    right++;
                }else {
                    break;
                }
            }
            ++left;//理由均同上
            --right;
            if((right-left+1)>=max){
                max=right-left+1;
                leftIndex=left;
                rightIndex=right;
            }
        }

        result=s.substring(leftIndex,rightIndex+1);//需要注意，substring函数是左闭右开的，需要rightIndex+1
        return  result;
    }
	 public static void main(String[] args) {
	        System.out.println(longestPalindrome("ababa"));//测试下
	    }
 
}

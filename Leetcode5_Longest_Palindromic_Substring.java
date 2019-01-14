
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
		for(int i=0;i<s.length();i++){//�Ӵ�Ϊż��
            int left=i;//��߾��Ǹ��ַ�����
            int right=i+1;//�ұߵ�һ����Ҫ��leftλ�õıȽ�
            while (left>=0&&left<right&&right<s.length()){
                if(s.charAt(left)==s.charAt(right)){
                    left--;
                    right++;
                }else {
                    break;
                }
            }
            ++left;//���ɾ�ͬ��
            --right;
            if((right-left+1)>=max){
                max=right-left+1;
                leftIndex=left;
                rightIndex=right;
            }
        }

        result=s.substring(leftIndex,rightIndex+1);//��Ҫע�⣬substring����������ҿ��ģ���ҪrightIndex+1
        return  result;
    }
	 public static void main(String[] args) {
	        System.out.println(longestPalindrome("ababa"));//������
	    }
 
}

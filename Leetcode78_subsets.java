import java.util.ArrayList;
import java.util.List;

public class Leetcode78_subsets {
	    public static List<List<Integer>> subsets(int[] nums) {
	        List<Integer> temp = new ArrayList();
	        List<List<Integer>> result = new ArrayList();
	        dfs(result,temp,nums,0);
	        return result;
	}
	    
	    public static void dfs(List<List<Integer>> result, List<Integer> temp, int nums[], int j){
	        result.add(new ArrayList<Integer>(temp));
	        for(int i = j;i<nums.length;i++){
	            temp.add(nums[i]);
	            dfs(result,temp,nums,i+1);
	            temp.remove(temp.size()-1);
	        }
	    }
	    
	    public static void main(String[] Args){
	    	int[] input = {1,2,3};
	    	subsets(input);
	    	
	    }
	
}

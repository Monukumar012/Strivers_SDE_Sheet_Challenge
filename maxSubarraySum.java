public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long ans=0,sum=0;
		for(int i:arr){
			if(sum<0)sum=0;
			sum+=i;
			ans=Math.max(ans,sum);
		}
		return ans;
	}

}

import java.io.*;
import java.util.* ;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		int max=0,s=0,n=arr.size();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            s+=arr.get(i);
            if(s==0){
                max=Math.max(max,i+1);
            }
            if(map.containsKey(s)){
                max=Math.max(max,i-map.get(s));
            }
            else map.put(s,i);
        }
        return max;
	}
}

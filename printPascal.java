import java.util.*;
public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        long ele=1;
        ArrayList<ArrayList<Long>> ans=new ArrayList<>();

        long dp[][]=new long[n][n];
        for(int i=0;i<n;i++){
            ArrayList<Long> temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || i==j){
                    dp[i][j]=1;
                }else{
                    dp[i][j]=(dp[i-1][j]+dp[i-1][j-1]);
                }
                temp.add(dp[i][j]);
            }
            ans.add(temp);
        }
        return ans;
	}
}

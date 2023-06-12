import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] a, int n) {
		int vote=0,leader=-1;
        for(int i:a){
            if(vote==0){
                vote=1;
                leader=i;
            }else if(leader==i)vote++;
            else vote--;
        }
        int cnt=0;
        for(int i:a){
            if(leader==i)cnt++;
        }
        return cnt>n/2 ? leader : -1;
	}
}
